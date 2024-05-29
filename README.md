# Model Transformation With LLMs
*Large Language Models such as ChatGPT have recently received significant traction in software development. Many papers are dedicated to investigating and understanding the capabilities and shortcomings of Large Language Models in code generation. However, the same cannot be said for its use within the domain of software modeling. The exploration of leveraging Large Language Models for software modeling tasks is yet to be analyzed further. In this paper, we explore the abilities of ChatGPT in conducting Text-to-Text model transformations, focusing on translating Unified Modeling Language class diagrams encoded in XML Metadata Interchange format to object-oriented code. In conducting the experiment, we developed a pipeline to evaluate the performance of ChatGPT to handle model transformations based on different complexity levels. Our results indicate that while Large Language Models like ChatGPT currently prove to be effective in handling very simple to intermediate model transformations, its performance declines with the increased complexity of the models, resulting in errors like missing classes and misclassified types, among others.* 

## Getting Started

These instructions will get you a copy of pipeline running on your local machine for development and testing purposes.

### Prerequisites

The following programs are required to execute the pipeline:

* [AutoHotKey](https://www.autohotkey.com/), 2.0 and 1.1
* [Beyond Compare](https://www.scootersoftware.com/)
* [Visual Studio Code](https://code.visualstudio.com/)
* [Language Support for Java(TM) by Red Hat](https://marketplace.visualstudio.com/items?itemName=redhat.java), Version 1.28.1 
* [Python](https://www.python.org/)

### Installing

Once the prerequisites are all downloaded the following steps have to be conducted:

Configure language support:
```
When installing the language support make sure to configure "Format On Save," for Java. In Visual Studio code this can be done by going: 
Settings --> Command Palette --> Preferences: Configure Language Specific Settings --> Java --> Text Editor --> Formatting.
```

Specifying paths:

```
Your executable path for VS Code has to be specified in the following files:
formatJava.ahk - Line 4 and 11
formatJava_SecondIteration.ahk - Line 3

```


```
Your executable path for Python has to be specified in the following files:
firstIteration.bat - 51, 55, 63
secondIteration.bat - 47, 55
thirdIteration.bat - 47, 55
specificExecution.bat - 15, 23, 27, 36, 38

```

```
A shortcut to Beyond Compare has to be placed in the root directory. 

```

### Demo

If everything was installed correctly a demo can be attempted by executing the file ```specificExecution.bat``` and specifying the name ```demo```. 
After a successful execution the results are saved within the subfolder ```./allXMI/works/demo```
Within this folder the oracle is saved within ```oracle```, ChatGPT's output as well as the XMI sent to it is within ```gpt```, and the comparison can be found within ```comparison```.
For additional iterations, a file by the name of ```comparisonReportfirstExecution``` has to be created and be placed within the ```comparison``` folder. 
Furthermore, a subfolder within ```comparison``` by the name of "secondIteration" has to be created, this is where the new result will be saved.

To execute an additional iteration, move the entire project (in this case ```demo```) to ```./allXMI/works/secondIteration``` and execute the file ```secondIteration.bat```. 
For a third iteration, move the entire project to ```./allXMI/works/secondIteration/thirdIteration```, and within the subfolder ```secondIteration``` (for the project) create a file by the name of ```comparisonReportsecondExecution```.
Furthermore, create a subfolder within ```secondIteration``` with the name ```thirdIteration```, this is where the new comparison will be saved.
Lastly, execute the file ```thirdIteration.bat```

Examples of the file structure can be found within ```./allXMI/works/secondIteration``` and ```./allXMI/works/secondIteration/thirdIteration``` respectively.

Previously executed files have their names saved within  ```previousExecutions.txt```, ```previousExecutions_SecondIteration.txt``` and ```previousExecutions_ThirdIteration.txt``` respectively.


## Built With

* [AutoHotKey](https://www.autohotkey.com/) - Automating the pipeline
* [Beyond Compare](https://www.scootersoftware.com/) - Creation of comparison reports
* [Language Support for Java(TM) by Red Hat](https://marketplace.visualstudio.com/items?itemName=redhat.java) - Formatting
* [Visual Studio Code](https://code.visualstudio.com/)
* [Python](https://www.python.org/)

## License

This project is licensed under the Creative Commons Attribution-ShareAlike 4.0 (BY-SA) license. - see the [LICENSE.md](LICENSE.md) file for details

