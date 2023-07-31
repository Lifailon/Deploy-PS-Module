## Pipeline Service Manager

Jenkins pipeline for service management to Windows and Linux system.

**Stack:** 
- **Jenkins** (tested v2.416).
- Service Control Manager (use **GitHub**).
- **Ansible** (tested v2.10.8). Use module win_shell (from the collection ansible.windows) and shell.
- Executable code: **PowerShell/systemctl**.

## Scheme of work

```mermaid
flowchart TD
    classDef class_color fill:#68F1F7, stroke:#000, stroke-width:1px
    1[Jenkins Pipeline]:::class_color
    2[SCM: GitHub]:::class_color
    3[Jenkinsfile.Groovy passes parameters]:::class_color
    4[Playbook takes variables]:::class_color
    5[PowerShell/systemctl]:::class_color
    1--Connect-->2--Read-->3--Run Ansible-->4--Use module win_shell/shell-->5
    5--Output to Job-->1
```

## Job

![Image alt](https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/Build-Parameters.jpg)

![Image alt](https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/Stage-View.jpg)

## Output

<a href="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/Windows.jpg"><img src="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/Windows.jpg" width="400"/></a>
<a href="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/Linux.jpg"><img src="https://github.com/Lifailon/Pipeline-Service-Manager/blob/rsa/Screen/Linux.jpg" width="400"/></a>