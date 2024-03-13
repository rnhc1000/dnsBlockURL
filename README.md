## DNS RPZ - URL Blocked by DNS - @Ricardo Ferreira
In order to meet brazilian authorities requirements to block URLs 
being used to circumvent the legal brazilian regulatory system, this is 
a way of automate the creation of DNS Zones using BIND 9 and superior in sync 
with the Anatel ( Regulatory Agency ) guidance and data available at
a public API. The goal here is to allow Internet Service Providers that have BIND
as their DNS Engines to be fully compliant with the
legal and justice requirements near real-time with the authorities request.

## _Tools_
- Java 17
- IntelliJ Community Edition
- Spring Boot
- MongoDB
- ReactJS
- HTML
- CSS
- TypeScript

## _Table of contents_
- [DNS RPZ - URL Blocked by DNS - @Ricardo Ferreira](#dns-rpz---url-blocked-by-dns---ricardo-ferreira)
- [_Tools_](#tools)
- [_Table of contents_](#table-of-contents)
- [_Screenshot_](#screenshot)
- [_Links_](#links)
- [_Built with_](#built-with)
- [_What I practiced_](#what-i-practiced)
- [_Continued development_](#continued-development)
  - [_Useful resources_](#useful-resources)
- [_Author_](#author)
- [Acknowledgments](#acknowledgments)


## _Screenshot_
[![](./anablock-page.png)]()
## _Links_
- Live Site URL: [] 
## _Built with_

 ![](https://ferreiras.dev.br/assets/images/icons/java-icon.svg)| ![](https://ferreiras.dev.br/assets/images/icons/git-scm-icon.svg) | ![](https://ferreiras.dev.br/assets/images/icons/icons8-intellij-idea.svg) | ![](https://ferreiras.dev.br/assets/images/icons/linux-original.svg) | ![](https://ferreiras.dev.br/assets/images/icons/icons8-visual-studio-code.svg)

 ## _What I practiced_
```java
package br.dev.ferreiras.bloqueioAnatel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BloqueioAnatelApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloqueioAnatelApplication.class, args);
	}

}

``` 

## _Continued development_
- 
### _Useful resources_
- [https://docs.oracle.com/en/java/] Always trust and read the official documentation!
- [https://anatel.gov.br]- Official Agency Regulatory site
## _Author_
- Website - [https://ferreiras.dev.br]  
## Acknowledgments
