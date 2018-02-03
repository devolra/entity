<%@page import="de.devor.entity.model.PrimaryKey"%>
<%@page import="de.devor.entity.webapp.common.PageHelper"%>
<%@page import="de.devor.entity.webapp.business.page.entity.list.EntityListPageHelper"%>
<%@page import="de.devor.entity.model.Entity"%>
<%@page import="java.util.List"%>
<%@page import="de.devor.entity.webapp.common.PageModel"%>
<%@page import="de.devor.entity.webapp.business.page.entity.list.EntityListPageModel"%>
<jsp:include page="./pages/common/header.jsp"/>
<%
	EntityListPageModel model = (EntityListPageModel)request.getAttribute(PageModel.PAGE_MODEL);
	List<Entity> entities = model.getEntities();
	EntityListPageHelper pageHelper = (EntityListPageHelper)request.getAttribute(PageHelper.PAGE_HELPER);
%>		
		<table class="ui blue inverted celled table">
			<thead>
				<tr>
					<th>Name</th>
					<th>Description</th>
					<th>Primary key</th>
					<th>Indixes</th>
				</tr>
			</thead>
			<tbody>
				<%
					for (Entity entity : entities) {
						String name = entity.getName();
						String description = entity.getDescription();
						if (description == null) {
							description = "";
						}
						String primaryKeyName = "";
						PrimaryKey primaryKey = entity.getPrimaryKey();
						if (primaryKey != null) {
							primaryKeyName = primaryKey.getName();
						}
						String indices = pageHelper.getIndicesNames(entity);
				%>
				<tr>
					<td><%=name%></td>
					<td><%=description%></td>
					<td><%=primaryKeyName%></td>
					<td><%=indices%></td>
				</tr>
				<%}%>
			</tbody>
		</table>
<jsp:include page="./pages/common/footer.jsp"/>