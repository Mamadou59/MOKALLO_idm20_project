# Dans cette page se une description des concepts basic de la syntaxe markdown vers une page web Bootstrap.

#Les titres

Pour un titre les propriétés sont représentées par properties:(propriété:valeur,propriété:{propVal1:val1,propVal2:val2}) sur la même ligne avant le text du titre un titre peut avoir une couleur, un background, un margin et un padding avec une taille un alignment et une propriété spécifique **titleSize**.

# properties:(color:warning,backbackground:primary,margin:{size:large,alignment:left},padding:{size:small,alignment:center},titleSize:small) Un titre taille 1 avec une size small

## properties:(color:warning,backbackground:primary,margin:{size:large,alignment:left},padding:{size:small,alignment:center},titleSize:large) Un titre taille 2 avec une size large

### properties:(color:warning,backbackground:primary,margin:{size:large,alignment:left},padding:{size:small,alignment:center}) Un titre taille 2 sans size


# Un paragrapgh

Un paragraph peut aussi avoir toutes les propriétés générales.

properties:(color:warning,backbackground:muted,margin:{size:large,alignment:left},padding:{size:small,alignment:center})
Ceci est le text d'un paragraph `contenant un élément code` et qui a une couleur warning un background muted un margin et un padding

# Les Liens

Un lien en *Uikit* en plus des propriétés générales peut aussi avoir trois types spécifiques et est représenté comme suit [(properties) title](url)

## un lien avec la propriété **HeadingModifier** de uikit

### Un Titre avec un  [properties:(background:warning,margin:{size:large,alignment:left},padding:{size:small,alignment:center,linkProperty:headingModifier})lien vers BootstrapW3school](https://www.w3schools.com/bootstrap4/default.asp)

### un lien avec la propriété **MuteLink** de uikit

[properties:(background:warning,margin:{size:large,alignment:left},padding:{size:small,alignment:center,linkProperty:muteLink})Tables Extension](https://github.com/vsch/flexmark-java/wiki/Tables-Extension)

### un lien avec la propriété **TextModifier** de uikit

[properties:(background:warning,margin:{size:large,alignment:left},padding:{size:small,alignment:center,linkProperty:textModifier})Tables Extension](https://github.com/vsch/flexmark-java/wiki/Tables-Extension)

# Les liens avec références

Les liens avec référence sont directement transformés en des liens sans référence dès la transformation d'un modèle *simplemarkdown* vers un modèle *usd* car les références sont retrouvées et mis dans chaque lien lui référençant. 

I get 10 times more traffic from [Google] [1] than from
[Yahoo] [2] or [MSN] [3].

  [1]: http://google.com/        "Google"
  [2]: http://search.yahoo.com/  "Yahoo Search"
  [3]: http://search.msn.com/    "MSN Search"
  
# Les images

![properties:(background:warning,margin:{size:large,alignment:left},padding:{size:small,alignment:center},imageProperty)image](https://www.eclipse.org/images/egg-incubation.png)

# Les Sections

> Start section
> properties:(background:warning,margin:{size:large,alignment:left},padding:{size:small,alignment:center})
> ## Titre de la section
> Ce paragraph est dans la prémière section
> > Start section
> > ### Titre de la sous section
> > - list in section
> > - item 2
> > - item 3
> > fin de list
> > > Start section
> > > ### Titre de la sous sous section
> > > text du paragraphe


# Les boutons

## Button Styles

[properties:(color:secondary,background:warning,margin:{size:large,alignment:left},padding:{size:small,alignment:center})[btn]Primary](#)
[[btn-muted]muted](#)
[[btn-secondary]Secondary](#)
[[btn-success]Success](#)
[[btn-emphasis]Emphasis](#)
[[btn-warning]Warning](#)
[[btn-danger]Danger](#)


## Buttton Size

[[btn-primary btn-lg]Large](#)
[[btn-primary btn-md]Default](#)
[[btn-primary btn-sm]Small](#)