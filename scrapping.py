


from selenium import webdriver


driver = webdriver.Chrome(executable_path=r'/Users/sharadjoe/Documents/chromedriver')
driver.get("http://www.python.org")

print(driver.current_url)