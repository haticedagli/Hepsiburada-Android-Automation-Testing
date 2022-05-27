Feature: Android Login

  @Android
  Scenario: Başarılı Login
    Then Anasayfadaki profil iconuna tıklanır
    Then Profil sayfası giriş yap butonuna tıklanır
    And Kullanıcı email "haticeetoglu03@gmail.com" bilgisi girilir
    And Login sayfası kullanıcı ismi için giriş yap butonuna tıklanır
    And Kullanıcı password "Test.1234" bilgisi girilir
    And Login sayfası şifre için giriş yap butonuna tıklanır
    Then Giriş yaptıktan sonra gelen pop-up textinin "Hatice Dağlı" adına girildiği kontrol edilir

  @Android
  Scenario Outline: Basarisiz Login | Hatali Email Girilmesi
    Then Anasayfadaki profil iconuna tıklanır
    Then Profil sayfası giriş yap butonuna tıklanır
    And Kullanıcı email <email> bilgisi girilir
    And Login sayfası kullanıcı ismi için giriş yap butonuna tıklanır
    Then Başarısız login "E-posta adresi eksik veya hatalı." mesajı kontrol edilir
    Examples:
      | email                 |
      | "asdfasdfasdaadafadas@gmail.com" |
      | "dsdfsfdgfgfgfgfgfgfg@gmail.com" |

  @Android
  Scenario Outline: Basarisiz Login | Hatali Sifre Girilmesi
    Then Anasayfadaki profil iconuna tıklanır
    Then Profil sayfası giriş yap butonuna tıklanır
    And Kullanıcı email "haticeetoglu03@gmail.com" bilgisi girilir
    And Login sayfası kullanıcı ismi için giriş yap butonuna tıklanır
    And Kullanıcı password <password> bilgisi girilir
    And Login sayfası şifre için giriş yap butonuna tıklanır
    Then Başarısız login "Girdiğiniz şifre eksik veya hatalı." mesajı kontrol edilir
    Examples:
      | password   |
      | "test.1234" |
      | "Test1234" |
