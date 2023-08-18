/**javascript:书写语法
 * 1.每行结尾的分号可有可无
 * 2.变量可以存放不同类型的值，定义变量时不需要定义类型，只需用var声明
 * 3.使用var定义的变量为全局变量，且能重复定义
 * 4.可以用let来定义局部且不可重复定义的变量
 * 5.使用const定义常量
 * 6.使用typeof获取数据类型：
 *     number:整数，小数，NaN(Not a Number)
 *     string:字符，字符串，单双引皆可
 *     boolean:与java一致
 *     null:对象为空,当获取null类型的数据类型时，会输出object
 *     undefined:当声明的变量未初始化时，默认值为undefined
 * 7.==：判断类型是否一致，如果不一致，就转化为一致再比较
 *   ===：全等于：如果类型不一致，直接返回false，不会进行类型转换
 *   类型转换：
 *      1.其他类型转为数字：string:将字符串字面值转为数字，如果字面值不是数字，则转为NaN,一般采用parseInt进行转换
 *                       boolean:true转为1，false转为0
 *      2.其他类型转为boolean:
 *                      number:0和NaN转为false,其他的数字转为true
 *                      string:空字符串转为false,其他字符串转为true
 *                      null:转为false
 *                      undefined:转为false
 * 8.函数:等同于java中的方法，使用function关键词进行定义,形参不需要类型，return时也不需要类型
 *       1.function+方法名（参数1，参数2）{要执行的代码}
 *       2.var(let)+方法名=function(参数1，参数2){要执行的代码}
 * 9.对象：
 *       Array数组对象：var 变量名 = new Array(值),相当于java中的集合，长度和类型可以变化,push:添加方法，splice:删除元素,选定从第几个元素开始删除，删除几个元素
 *       string对象：定义方式和上一个一样
 *       自定义对象：var 对象名={对象名：对象值}，可以定义方法,对象之间要加逗号,访问方式和java一致
 * 10.BOM(浏览器对象模型)：
 *            alert：弹框
 *            confirm:确认和取消,该方法有返回值，为布尔类型
 *            setTimeout:在一定的时间间隔后执行一个function,只执行一次
 *            setInterval：在一定的时间间隔后执行一个function，循环执行
 *            history:；历史记录方法:back:加载列表的下一个url，forward：前一个
 *            location:地址栏对象：href:设置或返回完整的url,即跳转到输入的网址
 * 11.DOM（w3c标准）:
 *           1.获取element:根据id属性值获取，返回一个element对象:getElementsById
 *                        根据标签名称获取，返回element对象数组:getElementsByTagName
 *                        根据name属性值获取，返回element对象数组:getElementsByName
 *                        根据class属性值获取，返回element对象数组:getElementsByClassName
 * 12.事件监听：
 *           1.事件绑定：
 * 其他和java一致
 */
// alert("hello js")//window.alert写入警告栏
document.write("hello html")//写入html页面
console.log("hello jzq")//写入浏览器控制台
var jzq=99
jzq="贾志强"
var jzq="qzj"
let qzj=100
const jqz=101
let zqj=null
// alert(jzq)
// alert(qzj)
// alert(jqz)
// alert(typeof zqj)
let zjq="100"
// alert(zjq===qzj)
function add(a,b)
{
	return a+b
}
var j=add(1,2)
// alert(j)
var arr=new Array(1,2,3);
arr[7]="jzq"
arr.push(7)
arr.splice(0,1)
// alert(arr)
var str1=new String("abc");
document.write(str1.length)
var person={
	name:"jzq",
	age:21,
	eat:function(){		"吃饭"
	}
}
document.write(person.name)
// var flag=confirm("确认删除？")
setTimeout(function()
{
	// alert("jzq")
},3000)
// location.href="https://download.csdn.net/?spm=1000.2115.3001.6907"
var v=document.getElementById("light")//id属性
document.write(v)
var v1=document.getElementsByTagName("div")
function on()
{
	alert("jzq666")
}
document.getElementById("jzq").onclick=function()
{
	alert("qzj666")
}