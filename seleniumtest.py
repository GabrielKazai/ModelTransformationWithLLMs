from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.options import Options
import time
import urllib
import webbrowser
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager
import os
import socket
import threading
from json import dumps


f = open('input_xmi.xmi', 'r')

xmi = f.read()

f.close()

initial = "The following is an XMI file based on a UML diagram, please write corresponding Java code without adding any explanatory text before or after, get/set functions or comments in the code:"
second = "hi"

prompt = '%s \n %s' % (initial, xmi)
prompt2 = '%s \n %s' % (second, xmi)



options = webdriver.ChromeOptions()
options.add_argument("user-data-dir=C:\\Users\\Gabriel\\AppData\\Local\\Google\\Chrome\\User Data")
options.add_argument('profile-directory=Profile 1')
driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()), options=options)
driver.get('https://chat.openai.com/')
time.sleep(1)

input_box = driver.find_element(by=By.XPATH, value='//textarea[contains(@id, "prompt-textarea")]')
driver.execute_script(f"arguments[0].value = " + dumps(prompt) + ";", input_box)
input_box.send_keys(Keys.RETURN)
input_box.submit()
time.sleep(30)

response_elements = driver.find_elements(by=By.CSS_SELECTOR, value='div.text-base')

res = response_elements[-1].text

print(res)

w = open("ChatGPTResponse.txt", "w")
w.write(res)
w.close()

