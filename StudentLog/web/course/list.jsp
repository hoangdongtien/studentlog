<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<%@taglib  prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>


<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Quản lí khóa học</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.row -->

<!-- /.row -->
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Danh sách
                <div class="pull-right">
                    <div class="btn-group">
                        <button type="button" class="btn btn-default btn-xs dropdown-toggle" data-toggle="dropdown">
                            Actions
                            <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu pull-right" role="menu">
                            <li><a href="#">Action</a>
                            </li>
                            <li><a href="#">Another action</a>
                            </li>
                            <li><a href="#">Something else here</a>
                            </li>
                            <li class="divider"></li>
                            <li><a href="#">Separated link</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="dataTable_wrapper">
                    <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                        <thead>
                            <tr>
                                <th>Course</th>                                
                                <th>Year</th>                                
                                <th>Remarks</th>                                
                                <th>Status</th>  
                                <th>Edit</th>                                
                                <th>Delete</th>
                            </tr>
                        </thead>

                        <s:iterator value="courseList" var="c">
                            <tr>
                                <td>${c.courseCode}</td>                                
                                <td>${c.year}</td>                                
                                <td>${c.remarks}</td>                                
                                <td>${c.status}</td>   
                                <td><a href="#" class="deletelink"></a> </td>                                
                                <td><a href="#" class="deletelink"></a></td>
                            </tr>
                        </s:iterator>
                    </table>
                </div>
            </div>
            <!-- /.panel-body -->
        </div>
        <!-- /.panel -->                        

    </div>
    <!-- /.col-lg-8 -->

</div>
<!-- /.row -->