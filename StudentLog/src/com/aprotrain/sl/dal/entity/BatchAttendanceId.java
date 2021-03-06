package com.aprotrain.sl.dal.entity;
// Generated Apr 18, 2015 3:08:48 PM by Hibernate Tools 4.3.1


import java.io.Serializable;

/**
 * BatchAttendanceId generated by hbm2java
 */
public class BatchAttendanceId  implements java.io.Serializable {


     private long batchId;
     private Serializable sessionDate;
     private long studentId;

    public BatchAttendanceId() {
    }

    public BatchAttendanceId(long batchId, Serializable sessionDate, long studentId) {
       this.batchId = batchId;
       this.sessionDate = sessionDate;
       this.studentId = studentId;
    }
   
    public long getBatchId() {
        return this.batchId;
    }
    
    public void setBatchId(long batchId) {
        this.batchId = batchId;
    }
    public Serializable getSessionDate() {
        return this.sessionDate;
    }
    
    public void setSessionDate(Serializable sessionDate) {
        this.sessionDate = sessionDate;
    }
    public long getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof BatchAttendanceId) ) return false;
		 BatchAttendanceId castOther = ( BatchAttendanceId ) other; 
         
		 return (this.getBatchId()==castOther.getBatchId())
 && ( (this.getSessionDate()==castOther.getSessionDate()) || ( this.getSessionDate()!=null && castOther.getSessionDate()!=null && this.getSessionDate().equals(castOther.getSessionDate()) ) )
 && (this.getStudentId()==castOther.getStudentId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getBatchId();
         result = 37 * result + ( getSessionDate() == null ? 0 : this.getSessionDate().hashCode() );
         result = 37 * result + (int) this.getStudentId();
         return result;
   }   


}


