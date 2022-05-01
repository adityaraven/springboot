const express= require('express')
const bodyParser = require('body-parser'); //For taking input from user , for post operation
const {randomBytes} = require('crypto');

const app= express();
app.use(bodyParser.json());
//sss

const posts ={};

app.get('/posts', (req,res)=>{
    res.send(posts);
    
});

app.post('/posts',(req,res)=>{
    //Generate random looking Id of length 4
    const id=randomBytes(4).toString('hex');
    const {title}= req.body;
    
    posts[id]={
        id, title
    };

    res.status(201).send(posts[id]);
    
});

app.listen(4000, ()=>{
    console.log('Listening on 4000 all good');
});

