## Pipeline Service Manager

Jenkins pipeline for service manager

**Stack:** Jenkins, Ansible, PowerShell/Bash

```mermaid
erDiagram
    CUSTOMER ||--o{ ORDER : places
    ORDER ||--|{ LINE-ITEM : contains
    CUSTOMER }|..|{ DELIVERY-ADDRESS : uses
```

<a href="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/1-Stage-Status.jpg"><img src="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/1-Stage-Status.jpg" width="400"/></a>
<a href="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/2-Build-with-Parameters.jpg"><img src="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/2-Build-with-Parameters.jpg" width="400"/></a>
<a href="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/3-Only-State.jpg"><img src="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/3-Only-State.jpg" width="400"/></a>
<a href="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/4-Start-Service.jpg"><img src="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/4-Start-Service.jpg" width="400"/></a>