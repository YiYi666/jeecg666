<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="feedbackList" checkbox="true" pagination="true" fitColumns="true" title="今日反馈" actionUrl="feedbackController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="姓名"  field="createName"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建人登录名称"  field="createBy"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建日期"  field="createDate"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新人名称"  field="updateName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新人登录名称"  field="updateBy"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新日期"  field="updateDate"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="课程名称"  field="fbCourse"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="作业日期"  field="fbDate"  formatter="yyyy-MM-dd"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="速度"  field="fbSpeed"  query="true"  queryMode="single"  dictionary="fb_speed"  width="120"></t:dgCol>
   <t:dgCol title="难度"  field="fbDifficulty"  query="true"  queryMode="single"  dictionary="difficulty"  width="120"></t:dgCol>
   <t:dgCol title="感受"  field="fbFeel"  query="true"  queryMode="single"  dictionary="fb_feel"  width="120"></t:dgCol>
   <t:dgCol title="问题"  field="fbProblem"  queryMode="single"  width="500"></t:dgCol>
   <t:dgCol title="建议"  field="fbAdvise"  queryMode="single"  width="500"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="feedbackController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="feedbackController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="feedbackController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="feedbackController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="feedbackController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/task/feedbackList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'feedbackController.do?upload', "feedbackList");
}

//导出
function ExportXls() {
	JeecgExcelExport("feedbackController.do?exportXls","feedbackList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("feedbackController.do?exportXlsByT","feedbackList");
}

 </script>