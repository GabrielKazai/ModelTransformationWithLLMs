# Model Transformation With LLMs

One Paragraph of project description goes here

## Getting Started

These instructions will get you a copy of pipeline up and running on your local machine for development and testing purposes.

### Prerequisites

What things you need to install the software and how to install them

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
After a successful execution the results are saved within the subfolder ```/allXMI/works/demo```.
Previously executed files have their names saved within  ```previousExecutions.txt```, ```previousExecutions_SecondIteration.txt``` and ```previousExecutions_ThirdIteration.txt``` respectively.

## Built With

* [AutoHotKey](https://www.autohotkey.com/) - Automating the pipeline
* [Beyond Compare](https://www.scootersoftware.com/) - Creation of comparison reports
* [Language Support for Java(TM) by Red Hat](https://marketplace.visualstudio.com/items?itemName=redhat.java) - Formatting


## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)
* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

## License

This project is licensed under the Creative Commons Attribution-ShareAlike 4.0 (BY-SA) license. - see the [LICENSE.md](LICENSE.md) file for details

