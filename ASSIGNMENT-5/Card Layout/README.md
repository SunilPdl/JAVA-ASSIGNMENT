## CardLayout

The CardLayout class manages the components in such a manner that only one components is visible at a time.It treats each components as a card that is why it is known as CardLauyot.

### Cinstructors of CardLayout class

1- CardLayout(): Creates a card layout with zero horizontal and vertical gap.

2- CardLayout(int hgap,int vgap): Creates a card layout with the given horizontal and vertical gap.


### Commenly used methods of CardLayout class

* public void next(Container parent): Is used to flip to the next card of the given container.

* public void previous(Cointainer parent): Is used to flip to the previous card of the given container.

* public void first(Container parent): Is used to flip to the first card of the given container.

* public void show(Container parent,String name): Is used to flip to the specified card with the given name.