# Dans cette page se une description des concepts basic de la syntaxe markdown vers une page web Bootstrap.

# Les Propriété générales en Bootstrap

# Les Badge

Ceci est le text d'un badge avec les propriétés badge success et badge pill  [[badge badge-success badgePill] Badge whitout URL]()

Ceci est un lien en badge avec les propriétés badge danger et badge pill [[badge badge-danger badgePill] Badge with URL](url)



Les propriétés générales sont représentées entre parenthèses (propriété:valeur,propriété:{propVal1:val1,propVal2:val2}) un élément peut avoir une couleur, un background, un margin et un padding avec une taille un alignment et une bordure colorée ou non.

# Les titres

Les propriétés d’un titre sont représentées entre parenthèses sur la même ligne devant le texte du titre. Un titre peut donc avoir en plus des propriétés générales  un emphasis qui soit *italic* ou **Strong** et une propriété *display* qui peux avoir les valeurs {1,2,3,4} spécifique à la taille d'un titre en **Bootstrap**.

# properties:(color:warning,background:primary,margin:{level:5,alignment:left},padding:{level:5,alignment:center},border:{border,borderColor:secondary},display:1,emphasis:italic, alertProperty:{alertStyle:success,animated}) Un titre taille 1 avec un display 1

## properties:(color:warning,background:primary,margin:{level:5,alignment:left},padding:{level:5,alignment:center},border:{border,borderColor:secondary},display:1,emphasis:italic) Un titre taille 2 avec un display 3

### properties:(color:warning,background:primary,margin:{level:5,alignment:left},padding:{level:5,alignment:center},border:{border,borderColor:secondary},display:1,emphasis:italic) Un titre taille 3 avec un display 4

### properties:(margin:{level:5,alignment:left},padding:{level:5,alignment:center},border:{border,borderColor:secondary},display:4,emphasis:italic, alertProperty:{alertStyle:success,animated}) Un titre taille 3 avec un display 4 avec les propriétés alert *success* et *animeted*

# Un paragrapgh

Un paragraph peut aussi avoir toutes les propriétés générales et une propriété emphasis (*italic* ou **strong** pour tout le paragraph)

properties:(color:dark,background:primary,margin:{level:4,alignment:left},padding:{level:2,alignment:center},border:{border},emphasis:bold) 
Ce paragraph `contient un élément code` et à une couleur dark, un backround primary, un margin, un padding, une bordure non clorée et un emphasis bold.

properties:(alertProperty:{alertStyle:success,animated})
Ceci est un paragraphe avec des propriétés alertes 

properties:(color:primary,background:dark,margin:{level:4,alignment:left},padding:{level:2,alignment:center},border:{border, borderColor:danger},emphasis:italic) 
Ce paragraph à une couleur primary, un backround dark, un margin, un padding, une bordure clorée en danger et un emphasis italic.

# Les liens sans références

Un lien est représenté comme suit [(properties) title](url) et peut avoir toutes les propriétés générales 

[properties:(color:secondary,background:success,margin:{level:4,alignment:left},padding:{level:2,alignment:center},border:{border},emphasis:bold)BootstrapW3school](https://www.w3schools.com/bootstrap4/default.asp)

[properties:(color:info,background:success,margin:{level:4,alignment:left},padding:{level:2,alignment:center},border:{border},emphasis:italic)BtstrapW3school](https://www.w3schools.com/bootstrap4/default.asp)

Ceci est un alert contenant un lien avec une propriété *.alertlink*[properties:(color:info,background:success,margin:{level:4,alignment:left},padding:{level:2,alignment:center},border:{border},emphasis:italic, linkProperty:alertlink)BtstrapW3school](https://www.w3schools.com/bootstrap4/default.asp)

# Les liens avec références

Les liens avec référence sont directement transformés en des liens sans référence dès la transformation d'un modèle *simplemarkdown* vers un modèle *usd* car les références sont retrouvées et mis dans chaque lien lui référençant. 

I get 10 times more traffic from [Google] [1] than from
[Yahoo] [2] or [MSN] [3].

  [1]: http://google.com/        "Google"
  [2]: http://search.yahoo.com/  "Yahoo Search"
  [3]: http://search.msn.com/    "MSN Search"
  
# Les images

## Une image avec une forme *circle* et un alignement *center*

![properties:(color:warning,background:primary,margin:{level:5,alignment:left},padding:{level:5,alignment:center},border:{border,borderColor:secondary}, imageShape:circle,imageAligning:center)image](https://www.eclipse.org/images/egg-incubation.png)

## Une image avec une forme *rounded* et un alignement *responsive*

![properties:(color:warning,background:primary,margin:{level:5,alignment:left},padding:{level:5,alignment:center},border:{border,borderColor:secondary}, imageShape:circle,imageAligning:center)image](https://www.eclipse.org/images/egg-incubation.png)

# Les deux types de sections

En bootstrap, nous transformons les sections en container selon le type de container passer dans les propriétés soit un *fixconatainer* ou un *fluidcontainer*

> Start section
> properties:(color:warning,background:primary,margin:{level:5,alignment:left},padding:{level:5,alignment:center},border:{border,borderColor:secondary,containerType:fluidContainer})
> # properties:(background:primary,margin:{level:3,alignment:left},padding:{level:3,alignment:center},border:{border,borderColor:secondary}) Titre de la section
> properties:(color:warning,background:primary,margin:{level:2,alignment:left},padding:{level:2,alignment:center},border:{border,borderColor:secondary}) Ce paragraph est dans la première section qui est mis dans un fluid container de bootstrap.
> > Start section
> > properties:(color:warning,background:primary,border:{border,borderColor:secondary,containerType:fixContainer})
> > ## Titre de la sous section
> > une sous section qui est mis dans un fluid container de bootstrap qui contient également des lists.
> > - list in section
> > - item 2
> > - item 3
> > fin de list
> > > Start section
properties:(color:warning,background:primary,margin:{level:5,alignment:left},padding:{level:5,alignment:center},border:{border,borderColor:secondary,containerType:fixContainer},alertProperty:{alertStyle:success,animated})
> > > ### Titre de la sous sous section
> > > ![properties:(imageShape:circle,imageAligning:center)image](https://www.eclipse.org/images/egg-incubation.png)
> > > properties:(color:warning,background:primary,margin:{level:5,alignment:left},padding:{level:5,alignment:center},border:{border,borderColor:secondary})
> > > text du paragraphe

# Les boutons

## Button Styles

[properties:(color:secondary,background:primary,margin:{level:4,alignment:left},padding:{level:2,alignment:center},border:{border},emphasis:bold)[btn]Primary](#)
[[btn-primary]Primary](#)
[[btn-secondary]Secondary](#)
[[btn-success]Success](#)
[[btn-info]Info](#)
[[btn-warning]Warning](#)
[[btn-danger]Danger](#)
[[btn-dark, outline-primary]Dark](#)
[[btn-light, spinner]Light](#)
[[btn-link]Link](#)
[[btn]Doc bootstrap (un lien avec role button)](https://www.w3schools.com/bootstrap4/bootstrap_navbar.asp)

## Buttton Size

[[btn-primary btn-lg]Large](#)
[[btn-primary btn-md]Default](#)
[[btn-primary btn-sm]Small](#)

## Button States

[[btn-primary btn-lg]Primary Button](#)
[[btn-primary active]Active Primary](#)
[[btn-primary disabled]Disabled Primary](#)
[[lnk btn-primary disabled]Disabled Primary](#)
[[lnk btn-primary]Enabled Primary](#)


# Les blockquote
Blockquote :

> properties:(color:warning,background:primary,margin:{level:5,alignment:left},padding:{level:5,alignment:center},border:{border,borderColor:secondary},alertProperty:{alertStyle:success,animated})
> > sub block
> > properties:(color:warning,background:primary,margin:{level:5,alignment:left},padding:{level:5,alignment:center},border:{border,borderColor:secondary})
> > - list in blockquote
> > - item 2
> > - item 3
> > end list
> > 


# Les listes

List :

- properties:(color:warning,background:primary,margin:{level:5,alignment:left},padding:{level:5,alignment:center},border:{border,borderColor:secondary}, listProperty:basicList,alertProperty:{alertStyle:success,animated})

- start list. This is a paragraph
  on multiple lines.
  
  And another paragraph
- (itemProperty: active) item 2.
  * level 2 item 1
  * level 2 item 2
  - properties:(color:warning,background:primary,margin:{level:5,alignment:left},padding:{level:5,alignment:center},border:{border,borderColor:secondary}, listProperty:horizontalList)
  - level 2 item 3
    - level 3 item 1
    - level 3 item 2
    - level 3 item 3
    - level 4 item 1
        - next level ??
  - level 2 item 4
  - level 2 item 5

# Code en block

Ayant composés que des codeLine, un codeLine peut être réservé pour les propriétés générales qu’ils peuvent avoir. Les propriétés sont toujours précédés par properties:

````
properties:(color:warning,background:primary,margin:{level:5,alignment:left},padding:{level:5,alignment:center},border:{border,borderColor:secondary},alertProperty:{alertStyle:success,animated})
Ce block contient une ligne de propriétés qui n'est j'amais affichée après la géneration vers bootstrap.
Une autre ligne du bloc
````
# Navigation

## Basic navigation

[[nav basic] Vertical navigation](#)
[Link 1](#)
[Link 2](#)
[Link 3](#)

## Brand navigation

[properties:(color:warning,background:primary,margin:{level:5,alignment:left},padding:{level:5,alignment:center},border:{border,borderColor:secondary})[navbar-brand]Navbar brand](#)
[Link 1](#)
[Link 2](#)
[Link 3](#)

## Vertical navigation

[[nav vertical] Vertical navigation](#)
[Link 1](#)
[Link 2](#)
[Link 3](#)

## Centred navigation

[[nav centred] Centred navigation](#)
[Link 1](#)
[Link 2](#)
[Link 3](#)

# Table

| tabProperties:(sectionProps:(color:warning,background:primary,margin:{level:5,alignment:left}},border:{border,borderColor:secondary}),tableProps:(color:info,background:primary,margin:{level:5,alignment:left},padding:{level:5,alignment:center},border:{border,borderColor:secondary},tableProperty:darkTable),rowProps:(color:white,background:primary,margin:{level:5,alignment:left},padding:{level:5,alignment:center},border:{border,borderColor:secondary}),cellProps:(color:success,background:primary))Syntax      | tabProperties:(cellProps:(color:warning,background:primary)Description |
|:----------- | ----------- |
| tabProperties:(sectionProps:(color:warning,background:primary,margin:{level:5,alignment:left},padding:{level:5,alignment:center}),rowProps:(color:warning,background:primary),cellProps:(color:dark,background:primary,margin:{level:5,alignment:left},padding:{level:5,alignment:center},border:{border,borderColor:info}))Header      | tabPproperties:(cell:(color:danger,background:info,margin:{level:5,alignment:left},padding:{level:5,alignment:center},border:{border,borderColor:danger}))Title       |
| tabProperties:(cellProps:(color:warning,background:primary))Paragraph   | Text        |

| Syntax      | Description |  Code  |
| ----------- | ----------- | ------ |
| Header      | Title       | code1  |
| Paragraph   | Text        | code2  |
