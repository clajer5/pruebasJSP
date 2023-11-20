# pruebasJSP
 
Steps for a custom template:
1. Change the items property to objects
2. Change kind from List to Template
3. Add a name property to the metadata section
4. Remove status from each resource
5. Remove most of metadata except for name, labels, and annotations
6. Remove any automatically-assigned resources such as service Virtual IPs and Route hosts
7. (optional) Add template parameters 
