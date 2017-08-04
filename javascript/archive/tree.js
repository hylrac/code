const root = {
    value: 'html',
    children: ['head',
        {
            value: 'body',
            children: [
                { value: 'div', children: [] },
                { value: 'p', children: [] }
            ]
        }]
}

function displayNode(root) {
    console.log('node value', root.value);
    displayChildren(root.children);
}

function displayChildren(children) {
    children.forEach(function (child) {
        if (typeof child === 'string') {
            console.log('leaf', child);
        }
        else  {
            displayNode(child);
        }
    });
}
displayNode(root);