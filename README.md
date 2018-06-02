# Java--Binary-Tree

Ağaçlar üzerinde dolaşma mantığını anlatmak istiyorum.
Bunun için kullanılan 3 yöntem var

1- PreOrder
2- InOrder
3- PostOrder

PreOrder yöntemindeki dolaşma şekli şudur root-left-right yani
ilk önce root a bakılır sonra soldaki tüm düğümlere bakılır soldaki tüm düğümler bittikten sonra sağdaki tüm düğümelere bakılır

InOrder yönteminde ise left-root-right şeklindedir
Bu sefer ilk soldaki düğümlerin hepsine bakılır sonra root a bakılır en son da sağdaki düğümlerin hepsine bakılır

PostOrder da ise left-right-root
şeklinde olur

Burada dikkat edilmesi gereken mesela InOrder da ilk önce soldakiler bakılması lazım 1 tane baktıktan sonra root a geçilmez soldaki tüm düğümler bittikten sonra geçilir.

