from flask import Flask, render_template, request, redirect, url_for
from antlr4 import InputStream, CommonTokenStream
import sys, os
from werkzeug.utils import secure_filename
# إضافة مسار الـ grammars
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
# from exampleLexer import exampleLexer
# from exampleParser import exampleParser
from antlr4.tree.Trees import Trees
app = Flask(__name__)
# إعداد مجلد رفع الصور
UPLOAD_FOLDER = os.path.join('static', 'uploads')
os.makedirs(UPLOAD_FOLDER, exist_ok=True)
app.config['UPLOAD_FOLDER'] = UPLOAD_FOLDER
# قائمة المنتجات (مخزنة مؤقتاً في الذاكرة)
products_data = []
# دالة لتشغيل الـ Parser (ممكن نوسعها لاحقاً لتوليد AST)
def run_parser(code: str):
    lexer = exampleLexer(InputStream(code))
    tokens = CommonTokenStream(lexer)
    parser = exampleParser(tokens)
    tree = parser.program()
    return Trees.toStringTree(tree, parser.ruleNames)
# الصفحة الرئيسية: عرض المنتجات
@app.route('/')
def products():
    return render_template('products.html', products=products_data)
# إضافة منتج جديد
@app.route('/add', methods=['GET', 'POST'])
def add_product():
    if request.method == 'POST':
        name = request.form.get('name')
        price = request.form.get('price')
        details = request.form.get('details')
        image = request.files.get('image')
        filename = None
        if image and image.filename.strip() != '':
            filename = secure_filename(image.filename)
            image_path = os.path.join(app.config['UPLOAD_FOLDER'], filename)
            image.save(image_path)
        product_id = len(products_data)
        products_data.append({
            'id': product_id,
            'name': name,
            'price': price,
            'details': details,
            'image': filename
        })
        return redirect(url_for('products'))
    return render_template('add_product.html')
# تفاصيل منتج
@app.route('/product/<int:product_id>')
def product_details(product_id):
    if 0 >= product_id  or product_id >= len(products_data):
        return "Product not found", 404
    product = products_data[product_id]
    return render_template('product_details.html', product=product)
# حذف منتج
@app.route('/delete/<int:product_id>', methods=['GET', 'POST'])
def delete_product(product_id):
    if 0 >= product_id  or product_id >= len(products_data):
        return "Product not found", 404
    product = products_data[product_id]
    if request.method == 'POST':
        products_data.pop(product_id)
        return redirect(url_for('products'))
    return render_template('delete_product.html', product=product)
if __name__ == '__main__':
    app.run(debug=True)