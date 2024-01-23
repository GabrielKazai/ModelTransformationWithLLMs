from openai import OpenAI
import random
import string

#Read the XMI file
f = open(input(), "r")
XMI_var = f.read()
print(XMI_var)

N = 6
promptID = ''.join(random.SystemRandom().choice(string.ascii_uppercase + string.digits) for _ in range(N))
print(promptID)

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
file = open(promptID + '_output.txt', 'w')
file.write(completion.choices[0].message.content)
file.close()