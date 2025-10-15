/**
 * HTML içeriği üreten yardımcı sınıf.
 * Bu sınıfın tek sorumluluğu, web sunucusunda gösterilecek
 */
public class HtmlGenerator {

    public static String getHomePageHtml() {
        // Kişisel bilgiler
        String adSoyad = "Ad Soyad :Emre KARA";
        String ogrenciNo = "Öğrenci NO: 1240505019";
        String biyografi = "2005 yılında istanbul'da doğdum. "
                + "Şu anda Kırklareli Üniversitesi Yazılım mühendisliği öğrencisiyim. "
                + "Bilgisayarların birbiriyle nasıl konuştuğu ve internetin arka planında nelerin döndüğü her zaman ilgimi çekmiştir. "
                + "Bu basit web sunucusu projesi, bu karmaşık ve büyüleyici dünyaya attığım ilk adımlardan biridir. "
                + "Soketler, portlar ve protokoller gibi soyut kavramları kod yazarak somut hale getirmek, "
                + "benim için heyecan verici bir öğrenme deneyimi oldu.";

        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<!DOCTYPE html>\n");
        htmlBuilder.append("<html lang='tr'>\n");
        htmlBuilder.append("<head>\n");
        htmlBuilder.append("    <meta charset='UTF-8'>\n");
        htmlBuilder.append("    <title>Ödev Web Sunucusu</title>\n");
        htmlBuilder.append("</head>\n");
        htmlBuilder.append("<body style='background-color:#f0f0f0; font-family: Arial, sans-serif;'>\n");
        htmlBuilder.append("    <h1>").append(adSoyad).append("</h1>\n");
        htmlBuilder.append("    <h2>").append(ogrenciNo).append("</h2>\n");
        htmlBuilder.append("    <hr>\n");
        htmlBuilder.append("    <p style='color: #333399; font-size: 16px;'>\n");
        htmlBuilder.append(biyografi);
        htmlBuilder.append("    </p>\n");
        htmlBuilder.append("</body>\n");
        htmlBuilder.append("</html>");

        return htmlBuilder.toString();
    }
}