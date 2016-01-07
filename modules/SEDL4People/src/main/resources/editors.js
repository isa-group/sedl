	$( document ).ready(function() {

            var style ="<style type=\"text/css\" media=\"screen\">";
            var script="<script>";
            var num=0;
            $(".code").each(function(){
                num +=1;
                $(this).attr("id","editor"+num);
                script+="var editor"+num+" = ace.edit(\"editor"+num+"\");"+
                    "editor"+num+".setReadOnly(true);"+
                    "editor"+num+".setTheme('ace/theme/SEDL4People');"+
                    "editor"+num+".getSession().setMode('ace/mode/SEDL4People');"+
                    "editor"+num+".setOptions({maxLines: Infinity});";
                    style+="#editor"+num+",";
            });
            script+="<\/script>";
            style=style.substring(0, style.length-1);
              style+="{"+
                    "position: relative;"+
                    "width: 600px;"+
                    "top: 0;"+
                    "right: 0;"+
                    "bottom: 0;"+
                    "left: 0;"+
                    "}"+
                "<\/style>";

            $('head').append(style);
            $('head').append(script);

        });

