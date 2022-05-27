Feature: Android Favorite Feature

  @Android
  Scenario: Ürünü başarılı bir şekilde favorilere ekleme
    Then Anasayfadaki profil iconuna tıklanır
    Then Profil sayfası giriş yap butonuna tıklanır
    And Kullanıcı email "haticeetoglu03@gmail.com" bilgisi girilir
    And Login sayfası kullanıcı ismi için giriş yap butonuna tıklanır
    And Kullanıcı password "Test.1234" bilgisi girilir
    And Login sayfası şifre için giriş yap butonuna tıklanır
    Then Giriş yaptıktan sonra gelen pop-up textinin "Hatice Dağlı" adına girildiği kontrol edilir
    And Tamam butonuna basılarak pop-up kapatılır
    And Çarpı butonuna basarak hesabım sayfası kapatılır
    And Ana sayfaya gidildiği kontrol edilir
    And Arama barına tıklanır
    And Arama barından "Telefon" ürünü aranır.
    And 3. satır 5. ürüne tıklanır ve detayına gidilir.
    And Detayına gidilen ürün favoriye eklenir ve favoriye eklenen ürünün ismi kaydedilir.
    And Geri butonuna tıklanır ve ürün listesi sayfası görülür.
    And Tab bar alanında Listelerim tab'ine tıklanır.
    And Beğendiklerim kategorisine gidilir.
    Then Favoriye eklenen ürünün geldiği ve ürün fiyatının doğru geldiği kontrol edilir.