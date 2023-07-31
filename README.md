## Pipeline Service Manager

Jenkins pipeline for service management to Windows and Linux system.

**Stack:** Jenkins, SCM (GitHub), Ansible (tested v2.10.8) and module win_shell (from the collection ansible.windows), PowerShell/Bash.

```mermaid
stateDiagram-v2
    Jenkins --> Jenkins.Groovy: GitHub
    Jenkins.Groovy --> Playbook: Ansible
    Playbook --> PowerShell/Bash: Module win_shell/shell
    PowerShell/Bash --> Jenkins: Output to Job
```

```mermaid
flowchart TD
    classDef class_color fill:#7FFFD4, stroke:#000, stroke-width:1px
    A[Jenkins]:::class_color
    B[SCM: GitHub]:::class_color
    C[Jenkins.Groovy]:::class_color
    A--->B
    B--->C
    C--->B
```

## Work example:

<a href="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/1-Stage-Status.jpg"><img src="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/1-Stage-Status.jpg" width="400"/></a>
<a href="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/2-Build-with-Parameters.jpg"><img src="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/2-Build-with-Parameters.jpg" width="400"/></a>
<a href="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/3-Only-State.jpg"><img src="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/3-Only-State.jpg" width="400"/></a>
<a href="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/4-Start-Service.jpg"><img src="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/4-Start-Service.jpg" width="400"/></a>