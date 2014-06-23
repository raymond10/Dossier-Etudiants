      if(window.history.forward(1) != null)
            	window.history.forward(1);

      function openLoginDialog() {
      	Dialog.info(document.getElementById('begin').innerHTML, {windowParameters: {className:"mac_os_x", title: "Identification", width:600, showEffect:Effect.Appear}});
      }

      function openErrorDialog() {
      	Dialog.info(document.getElementById('erreur').innerHTML, {windowParameters: {className:"mac_os_x", title: "Une erreur s'est produite", width:520, height:520, resizable:true, closable: true, showEffect:Effect.Appear}});
      }

      function openAlertWin() {
        Dialog.info(document.getElementById('alertWin').innerHTML, {windowParameters: {className:"mac_os_x", title: "Une erreur s'est produite", width:200, height:100, resizable:true}}); 
      }
      
      function openConfirmWin(message) {
        Dialog.confirm(message, {windowParameters: {className:"mac_os_x", title: "Une erreur s'est produite", width:200, height:100, resizable:true}, okLabel:"Fermer"}); 
      }
      
      function openListeSelectionWin(id,url,title,updateContainerId,autoresizeElement,modal) {
       		var winid = 'WinSelectList';
       		if (id == null) {
       			winid = 'WinSelectListUrl';
       		}
       		if (modal == null) {
       			modal = false;
       		}
        	var win = Windows.getWindow(winid);
        	if (win != null) {
        		win.destroy();
        	}
        	var d = null;
        	if (title == null) {
        		title = "Selectionner les Žlements dans la liste";
        	}
        	if (url != null){
        		// win = new Window('WinSelectListUrl', {className: "mac_os_x", title: title, top:70, left:100, width:300, height:200, resizable: true, closable: true, minimizable: false, maximizable: false, showEffectOptions: {duration:0.5}});
      		// win.setAjaxContent(url,null,true,true);
        		win = new Window(winid, {className: "mac_os_x", title: title, top:70, left:100, width:300, height:200, resizable: true, closable: false, minimizable: false, maximizable: false, url: url, showEffectOptions: {duration:0.5}});
        		if (autoresizeElement != null) {
        			d = Element.getDimensions($(autoresizeElement));
        		}
        	} else if (id != null) {
        		win = new Window('WinSelectList', {className: "mac_os_x", title: title, top:70, left:100, width:300, height:200, resizable: true, closable: false, minimizable: false, maximizable: false, showEffectOptions: {duration:0.5}});
      		win.setContent(id,true,true);
        	}
      	// var editorOnClose = { onClose: function(eventName, win) {if (id != null) document.getElementById(id).style.display='none'; } };
      	// Windows.addObserver(editorOnClose);		
      	win.setDestroyOnClose();
      	win.toFront();
      	if (d != null) {
      		win.setSize(d.width, d.height);
      	}				  	
      	win.showCenter(true);
       	}
      
       	function openConfirmPanel(message) {
       		// Dialog.confirm(message, {windowParameters: {width:300}, okLabel: "OUI", cancelLabel: "NON", id: "myDialogId", cancel:function(win) {alert("cancel confirm panel")}, ok:function(win) {alert("validate confirm panel"); return true;} });
       		return confirm(message); 
       	}
       	
       	function openAlertPanel(message) {
       		// Dialog.confirm(message, {windowParameters: {width:300}, okLabel: "OUI", cancelLabel: "NON", id: "myDialogId", cancel:function(win) {alert("cancel confirm panel")}, ok:function(win) {alert("validate confirm panel"); return true;} });
       		alert(message); 
       		return false;    //
       	}