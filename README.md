# Model Transformation With LLMs
*Large Language Models such as ChatGPT have recently received significant traction in software development. Many papers are dedicated to investigating and understanding the capabilities and shortcomings of Large Language Models in code generation. However, the same cannot be said for its use within the domain of software modeling. The exploration of leveraging Large Language Models for software modeling tasks is yet to be analyzed further. In this paper, we explore the abilities of ChatGPT in conducting Text-to-Text model transformations, focusing on translating Unified Modeling Language class diagrams encoded in XML Metadata Interchange format to object-oriented code. In conducting the experiment, we developed a pipeline to evaluate the performance of ChatGPT to handle model transformations based on different complexity levels. Our results indicate that while Large Language Models like ChatGPT currently prove to be effective in handling very simple to intermediate model transformations, its performance declines with the increased complexity of the models, resulting in errors like missing classes and misclassified types, among others.* 

## Getting Started

These instructions will get you a copy of pipeline running on your local machine for development and testing purposes.

### Prerequisites

The following programs are required to execute the pipeline:

* [AutoHotKey](https://www.autohotkey.com/)
* [Beyond Compare](https://www.scootersoftware.com/)
* [Language Support for Java(TM) by Red Hat](https://marketplace.visualstudio.com/items?itemName=redhat.java)
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
The paths within the following files need to be specified:
firstIteration.bat
secondIteration.bat
thirdIteration.bat
specificExecution.bat

```

### Demo

If everything was installed correctly a demo can be attempted by executing the file ```specificExecution.bat``` and specifying the name ```demo```. 
After a successful execution the results are saved within the subfolder ```./allXMI/works/demo```.
Previously executed files have their names saved within  ```previousExecutions.txt```, ```previousExecutions_SecondIteration.txt``` and ```previousExecutions_ThirdIteration.txt``` respectively.

## Built With

* [AutoHotKey](https://www.autohotkey.com/) - Automating the pipeline
* [Beyond Compare](https://www.scootersoftware.com/) - Creation of comparison reports
* [Language Support for Java(TM) by Red Hat](https://marketplace.visualstudio.com/items?itemName=redhat.java) - Formatting


## License

This project is licensed under the Creative Commons Attribution-ShareAlike 4.0 (BY-SA) license. - see the [LICENSE.md](LICENSE.md) file for details

