# Team 03
# QueryCart Mobile

# DIKKAT EDILMESI GEREKENLER


***GITHUB DA DIKKAT EDILMESI GEREKENLER***
> Projede calismaya baslamadan once mutlaka
>
>      1- main branch'inde "git pull" islemi yapilmalidir
>      2- kendi branch'imize gecip "git merge main" islemi yapilmalidir.

> Github'a ekleme yapilirken kesinlikle **git add .** kullanilmayacak!

***COMMIT ETME ISLEMI***
> **git add src/test/java/pages/US001_002_003_004_005.java** seklinde yapilacak!
>> (class'a sag click > copy path/.. > path from content root) dosya yolu kopyalanir.
>
> **git commit -m "GG.AA.YY/name-2"** (-2 --> gün içinde push etme sayısına göre)
>
> **git push**

***
> -Her islemden once mutlaka main branch'inde olunmadigi kontrol edilmelidir.
>
> -Main branch'inde degisiklik gerekiyorsa lead ile iletisime gecilmeli
***

***ORTAK METHODLAR***
> signIn(String email, String password)
> 
> clickAndVerify(WebElement element)
> 
> clickAndSendKeys(WebElement element, String context)
>

***ORTAK KULLANILACAK FEATURE STEPLERİ***
> User clicks on profile button.
> 
> User logs in "ihsanEmail".
> 
> User navigates to back for 1 time.
> 
> User clicks on 121,545.
