/**
* Upload python package
*/
def call(String PYPI_USERNAME = 'user', String PYPI_PASS = 'user', String PYPI_REPO = 'localhost') {
	sh '''
	rm -rfv env dist
	python3 -m venv env
	. env/bin/activate
	pip install twine wheel
	python setup.py bdist_wheel
	twine upload  --repository-url ${PYPI_REPO} \
	-u ${PYPI_USERNAME} -p ${PYPI_PASS} dist/* --verbose
	deactivate
	rm -rfv env dist
	'''
}

