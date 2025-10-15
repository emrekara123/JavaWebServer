# Java ile Basit Web Sunucusu

Bu proje, Java programlama dili ve standart ağ kütüphaneleri (`java.net`) kullanılarak oluşturulmuş basit bir HTTP sunucusudur. Proje, herhangi bir üçüncü parti kütüphane veya framework (Spring, Apache Tomcat vb.) kullanmamaktadır.

## Amaç

Bu projenin temel amacı, soket programlamanın temellerini anlamak ve bir web sunucusunun en basit haliyle nasıl çalıştığını kavramaktır. Sunucu, belirtilen bir portu dinler ve gelen HTTP GET isteklerine önceden tanımlanmış bir HTML sayfası ile yanıt verir.

## Özellikler

-   **Port:** Sunucu `1989` portu üzerinden hizmet vermektedir.
-   **Yanıt:** Tarayıcıdan gelen bağlantılara statik bir HTML sayfası sunar.
-   **HTML İçeriği:** Sunulan sayfada `<h1>`, `<h2>` etiketleri ve CSS ile biçimlendirilmiş bir paragraf bulunmaktadır.
-   **Bağımsızlık:** Sadece Java SE Development Kit (JDK) gerektirir.

## Nasıl Çalıştırılır?

1.  Bu repoyu bilgisayarınıza klonlayın:
    ```bash
    git clone [https://github.com/KULLANICI_ADINIZ/java-simple-web-server.git](https://github.com/KULLANICI_ADINIZ/java-simple-web-server.git)
    ```
2.  Projeyi tercih ettiğiniz bir Java IDE (örn: IntelliJ IDEA, Eclipse) ile açın.
3.  `src` klasörünün altındaki `SimpleWebServer.java` dosyasını bulun ve çalıştırın.
4.  Konsolda "Sunucu 1989 portunda başlatıldı..." mesajını gördükten sonra web tarayıcınızı açın.
5.  Adres çubuğuna `http://localhost:1989` yazın ve Enter'a basın.

## Kullanılan Teknolojiler

-   **Java:** Programlama dili
-   **Java Sockets:** Ağ iletişimi için
-   **HTML & CSS:** İstemciye gönderilen içerik ve biçimlendirme için
