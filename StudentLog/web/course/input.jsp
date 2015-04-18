<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<%@taglib  prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!-- /.row -->
<div class="row">
    <div class="col-lg-12">
        <s:form action="dashboard/course/save">
            <!--col1-->
            <div class="col-lg-4">
                <div class="form-group">
                    <label>Mã khóa học</label>
                    <s:textfield name="course.courseCode" cssClass="form-control" placeholder="Course Code"/>
                    <p class="help-block">VD: ACCP i5, ACCP i7, ACCP i11...</p>
                </div>

                <div class="form-group">
                    <label>Ghi chú</label>
                    <s:textarea name="course.remarks" cssClass="form-control" placeholder="Course Code"/>
                    <p class="help-block">VD: Khóa học cho i13</p>
                </div>

                <div class="form-group">
                    <button type="submit" class="btn btn-primary">Thêm mới</button>
                    <button type="reset"  class="btn btn-default">Cancel</button>
                </div>
            </div>
            <!--/.col1-->

            <!--col2-->
            <div class="col-lg-4">
                <div class="form-group">
                    <label>Năm áp dụng</label>
                    <s:textfield name="course.year" cssClass="form-control" type="number"/>
                    <p class="help-block">&nbsp;</p>
                </div>

                <div class="form-group">
                    <label>Tình trạng</label>
                    <s:textarea name="course.status" cssClass="form-control" placeholder="Status"/>
                    <p class="help-block">&nbsp;</p>
                </div>
            </div>
            <!--/.col2-->

            <!--col3-->
            <div class="col-lg-4">
                <div class="alert alert-danger">
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. <a href="#" class="alert-link">Alert Link</a>.
                </div>
            </div>
            <!--/.col3-->
        </s:form>


    </div>
    <!-- /.col-lg-8 -->

</div>
<!-- /.row -->


