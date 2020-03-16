# SpringData--Auditing
* Herhangi bir kayıt üzerinde kimin ne zaman nereden erişerek ne tür bir degisiklik yaptıgını takip etmek icin olusturulan kayıtlara AUDiTiNG  kayitlari denilir.

* Spring Data JPA modulü entitylerin üzerinde gerçekleştirilen INSERT ve UPDATE işlemleri ile ilgili audit transparan biçiminde yönetme imkanı sunar.

* Kullanıcı bilgisi insert veya update işlemini yapan kullanıcı bilgisini ve insert / update zamanını içerir.
* Kullanıcı bilgisi Spring Security aktif ise oradan elde edilir, istenirse farklı bir yerdende saglanabilir.
* Audit bilgileri entitylere ait tabloda tutulur.
* Entity kaydı insert eden kullanıcı ve insert zamanının tutulacagı alanlar String ve Date tipinde degişkenler olarak entity sınıfında tanımlamalı ve @CreatedBy ve @CreatedDate anatasyonları ile işaretlenmelidir.
   Update Güncelleme için ise @LastModifiedBy ve @LastModifiedDate ile işaretlenmektedir.
* Entity Sınıf üzerinde Audit bilgisini yönetildigini transparan bir biçimde yönetilecegi söylemek içinde sınıf düzeyinde @EntityListeners ile tanımlamalı bu anatasyon içerisindede @AuditEntityListener sınıfı olmalıdır.

* Audit Konfigürasyon Aktivasyonu = Projenin herhangi bir konfigürasyon sınıfı üzerinde @EnableJPAAuditing anatasyonu tanımlanarak audit kabiliyeti devreye sokulabilir.

* insert ve update yapan kullanıcı bilgisinin Spring Security kullanıyor ise oradan elde edilecegini söylemiştik. Bunun için AuditorAware isimli interface implement eden bir bean vasıtası ile kullanıcı bilgisi farklı bir şekilde de elde edilebilir.
Dip NOT= AuditAware implement eden spring bean nini @EnableJPAAuditing anatasyonuna tanıtmalıyız.
