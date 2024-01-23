from openai import OpenAI
import random
import string
import sys

#Read the XMI file
f = open(sys.argv[1], "r")
XMI_var = f.read()
print(XMI_var)

#GPT

client = OpenAI(
    api_key="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"
)

completion = client.chat.completions.create(
  model="gpt-3.5-turbo",
  messages=[
    {"role": "system", "content": "You are a LLM"},
    {"role": "user", "content": "This XMI code is related to a UML class diagram, please write the corresponding java code: " + XMI_var}
  ]
)

print(completion.choices[0].message.content)

#GPT

#Write result to XMI
file = open('GPT_output.java', 'w')
file.write(completion.choices[0].message.content)
file.close()