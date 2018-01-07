$(function() {
	$('#queryCondition').panel({
		width: 800,
		height: 150,
		title: '查询条件',

	});

	$('#PlanList').panel({
		width: 800,
		height: 400,
		title: '计划列表',

	});
	$('#planListTable').datagrid({
		url: 'datagrid_data.json',
		fitColumns:true,
		singleSelect:true,
		pagination:true,
		rownumbers:true,
		pageList:[2,4,6,8,10,12,14,16,18,20],
		pageSize:2,
		toolbar: '#planQueryInstrument',
		columns: [
			[{
					field: 'id',
					title: '计划id',
					checkbox:true,
					width: 100
				},{
					field: 'name',
					title: '计划名称',
					width: 100
				},
				{
					field: 'planType',
					title: '计划类型',
					width: 100
				},
				{
					field: 'planActivities',
					title: '计划业态',
					width: 100,
					align: 'right'
				},{
					field: 'projectName',
					title: '项目名称',
					width: 100
				},
				{
					field: 'userName',
					title: '创建人',
					width: 100
				}
			]
		]
	});

})