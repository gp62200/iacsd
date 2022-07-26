const express=require("express")
const app=express();
var bodyparser=require("body-parser");
var m1=require("./module1")

app.use(bodyparser.urlencoded({extended:false}))
app.get("/",function(req,resp){
    resp.sendFile("public/index.html",{root:__dirname})
})
app.post("/submit_data",function(req,resp){
    var num1=req.body.n1;
    var num2=req.body.n2;
    var num3=req.body.n3;
    switch(req.body.btn){
        case "add":
            ans=m1.addition(num1,num2);
            resp.send("n1: "+num1+" + n2 : "+num2+" = "+ans);
            console.log(ans);
            break;
        case "sub":
            ans=m1.subtract(num1,num2);
            resp.send("n1: "+num1+" - n2 : "+num2+" = "+ans)
                break;
        case "mul":
            ans=m1.multiply(num1,num2);
            resp.send("n1: "+num1+" * n2 : "+num2+" = "+ans)
            break;
        case "div":
            ans=m1.division(num1,num2);
            resp.send("n1: "+num1+" / n2 : "+num2+" = "+ans)
            break;
        case "sq":
            ans=m1.square(num1,num2);
            resp.send("ans: "+ans)
            break;
        case "sum":
            ans=m1.sum(num1,num2,num3);
//         // resp.send(`<h3>${ans}</h3`)
            resp.send("ans: "+ans)
            break;    
    }
