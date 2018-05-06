<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>今日反馈</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="feedbackController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${feedbackPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							课程名称:
						</label>
					</td>
					<td class="value">
					     	 <input id="fbCourse" name="fbCourse" type="text" style="width: 150px" class="inputxt"  datatype="*"  ignore="checked" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">课程名称</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							作业日期:
						</label>
					</td>
					<td class="value">
							   <input id="fbDate" name="fbDate" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">作业日期</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							速度:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="fbSpeed" type="list"  datatype="*"  typeGroupCode="fb_speed"  defaultVal="${feedbackPage.fbSpeed}" hasLabel="false"  title="速度" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">速度</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							难度:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="fbDifficulty" type="list"  datatype="*"  typeGroupCode="difficulty"  defaultVal="${feedbackPage.fbDifficulty}" hasLabel="false"  title="难度" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">难度</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							感受:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="fbFeel" type="list"  datatype="*"  typeGroupCode="fb_feel"  defaultVal="${feedbackPage.fbFeel}" hasLabel="false"  title="感受" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">感受</label>
						</td>
				</tr>
				
				
				<tr>
					<td align="right">
						<label class="Validform_label">
							问题:
						</label>
					</td>
					<td class="value" >
								<script type="text/javascript"  charset="utf-8" src="plug-in/ueditor/ueditor.config.js"></script>
								<script type="text/javascript"  charset="utf-8" src="plug-in/ueditor/ueditor.all.min.js"></script>
						    	<textarea name="fbProblem" id="fbProblem" style="width: 650px;height:300px"></textarea>
							    <script type="text/javascript">
							        var fbProblem_editor = UE.getEditor('fbProblem');
							    </script>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">问题</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							建议:
						</label>
					</td>
					<td class="value" >
						    	<textarea name="fbAdvise" id="fbAdvise" style="width: 650px;height:300px"></textarea>
							    <script type="text/javascript">
							        var fbAdvise_editor = UE.getEditor('fbAdvise');
							    </script>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">建议</label>
						</td>
					</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/task/feedback.js"></script>		
