## Pipeline Service Manager

Jenkins pipeline for service manager

**Stack:** Jenkins, Git, Ansible, PowerShell/Bash

```mermaid
stateDiagram-v2
    Jenkins --> CSM/GitHub: Jenkins.Groovy
    CSM/GitHub --> Ansible: Playbook
    Ansible --> PowerShell: Module
    PowerShell --> Jenkins: Output
```

<a href="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/1-Stage-Status.jpg"><img src="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/1-Stage-Status.jpg" width="400"/></a>
<a href="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/2-Build-with-Parameters.jpg"><img src="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/2-Build-with-Parameters.jpg" width="400"/></a>
<a href="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/3-Only-State.jpg"><img src="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/3-Only-State.jpg" width="400"/></a>
<a href="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/4-Start-Service.jpg"><img src="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/4-Start-Service.jpg" width="400"/></a>