function colourItemFactory(colorItem, isSelected, onSelect) {
    return (
        React.createElement(Color, { item: colorItem, isSelected: isSelected, onSelectChanged: onSelect })
    );
}
