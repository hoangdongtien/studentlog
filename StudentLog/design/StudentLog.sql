-- =============================================
-- Create database template
-- =============================================
USE master
GO

-- Drop the database if it already exists
IF  EXISTS (
	SELECT name 
		FROM sys.databases 
		WHERE name = N'[StudentLog_dev]'
)
DROP DATABASE [StudentLog_dev]
GO

CREATE DATABASE [StudentLog_dev]
GO

USE [StudentLog_dev]
GO

GO
ALTER DATABASE [StudentLog_dev] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [StudentLog_dev].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [StudentLog_dev] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [StudentLog_dev] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [StudentLog_dev] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [StudentLog_dev] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [StudentLog_dev] SET ARITHABORT OFF 
GO
ALTER DATABASE [StudentLog_dev] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [StudentLog_dev] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [StudentLog_dev] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [StudentLog_dev] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [StudentLog_dev] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [StudentLog_dev] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [StudentLog_dev] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [StudentLog_dev] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [StudentLog_dev] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [StudentLog_dev] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [StudentLog_dev] SET  DISABLE_BROKER 
GO
ALTER DATABASE [StudentLog_dev] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [StudentLog_dev] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [StudentLog_dev] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [StudentLog_dev] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [StudentLog_dev] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [StudentLog_dev] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [StudentLog_dev] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [StudentLog_dev] SET RECOVERY FULL 
GO
ALTER DATABASE [StudentLog_dev] SET  MULTI_USER 
GO
ALTER DATABASE [StudentLog_dev] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [StudentLog_dev] SET DB_CHAINING OFF 
GO
--ALTER DATABASE [StudentLog_dev] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
--GO
--ALTER DATABASE [StudentLog_dev] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
EXEC sys.sp_db_vardecimal_storage_format N'StudentLog_dev', N'ON'
GO

/****** Object:  User [student]    Script Date: 4/13/2015 3:36:23 PM ******/
--CREATE USER [student] WITHOUT LOGIN WITH DEFAULT_SCHEMA=[dbo]
--GO
--ALTER ROLE [db_owner] ADD MEMBER [student]
--GO
/****** Object:  Table [dbo].[Batch]    Script Date: 4/13/2015 3:36:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Batch](
	[BatchId] [bigint] IDENTITY(1,1) NOT NULL,
	[FacultyId] [bigint] NULL,
	[GpaDate] [date] NULL,
	[SubjectId] [bigint] NOT NULL,
	[StartDate] [date] NOT NULL,
	[ClassId] [bigint] NOT NULL,
	[BatchStatus] [tinyint] NOT NULL,
 CONSTRAINT [PK_Batch] PRIMARY KEY CLUSTERED 
(
	[BatchId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[BatchAttendance]    Script Date: 4/13/2015 3:36:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[BatchAttendance](
	[BatchId] [bigint] NOT NULL,
	[SessionDate] [date] NOT NULL,
	[StudentId] [bigint] NOT NULL,
	[AttendanceType] [tinyint] NULL,
	[Remarks] [nvarchar](500) NULL,
 CONSTRAINT [PK_BatchAttendance] PRIMARY KEY CLUSTERED 
(
	[BatchId] ASC,
	[SessionDate] ASC,
	[StudentId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[BatchSession]    Script Date: 4/13/2015 3:36:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[BatchSession](
	[BatchId] [bigint] NOT NULL,
	[SessionDate] [date] NOT NULL,
	[Remarks] [nchar](10) NULL,
	[SubFaculty] [bigint] NULL,
	[Duration] [tinyint] NULL,
	[SessionType] [tinyint] NULL,
 CONSTRAINT [PK_BatchSession] PRIMARY KEY CLUSTERED 
(
	[BatchId] ASC,
	[SessionDate] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[BatchStudentList]    Script Date: 4/13/2015 3:36:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[BatchStudentList](
	[BatchId] [bigint] NOT NULL,
	[StudentId] [bigint] NOT NULL,
	[AttendanceType] [tinyint] NULL,
	[Status] [tinyint] NULL,
	[Remarks] [nvarchar](500) NULL,
	[GpaQ1] [tinyint] NULL,
	[GpaQ2] [tinyint] NULL,
	[GpaQ3] [tinyint] NULL,
	[GpaQ4] [tinyint] NULL,
	[GpaQ5] [tinyint] NULL,
	[GpaQ6] [tinyint] NULL,
	[GpaRemarks] [nvarchar](500) NULL,
 CONSTRAINT [PK_BatchStudentList] PRIMARY KEY CLUSTERED 
(
	[BatchId] ASC,
	[StudentId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ClassOpenHouse]    Script Date: 4/13/2015 3:36:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[ClassOpenHouse](
	[ClassId] [bigint] NOT NULL,
	[OpenHouseMonth] [char](6) NOT NULL,
	[Title] [nvarchar](50) NULL,
	[OpenHouseStatus] [tinyint] NULL,
	[OpenHouseDate] [date] NULL,
 CONSTRAINT [PK_ClassOpenHouse] PRIMARY KEY CLUSTERED 
(
	[ClassId] ASC,
	[OpenHouseMonth] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[ClassUnit]    Script Date: 4/13/2015 3:36:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[ClassUnit](
	[ClassId] [bigint] NOT NULL,
	[ClassName] [varchar](10) NULL,
	[StartDate] [date] NULL,
	[ClassStatus] [varchar](10) NULL,
 CONSTRAINT [PK_Clazz] PRIMARY KEY CLUSTERED 
(
	[ClassId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Course]    Script Date: 4/13/2015 3:36:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Course](
	[CourseId] [bigint] NOT NULL,
	[CourseCode] [nvarchar](50) NOT NULL,
	[Year] [int] NULL,
	[Remarks] [nvarchar](50) NULL,
	[Status] [tinyint] NULL,
 CONSTRAINT [PK_Course] PRIMARY KEY CLUSTERED 
(
	[CourseId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Employee]    Script Date: 4/13/2015 3:36:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Employee](
	[EmployeeId] [bigint] IDENTITY(1,1) NOT NULL,
	[Fullname] [nvarchar](50) NULL,
	[SocialId] [nvarchar](20) NULL,
	[InternalEmail] [nvarchar](50) NULL,
	[ExternalEmail] [nvarchar](50) NULL,
	[DOB] [nchar](10) NULL,
	[JoiningDate] [date] NULL,
	[Password] [varchar](150) NULL,
	[EmployeeStatus] [tinyint] NULL,
 CONSTRAINT [PK_Employee] PRIMARY KEY CLUSTERED 
(
	[EmployeeId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Exam]    Script Date: 4/13/2015 3:36:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Exam](
	[ExamId] [bigint] IDENTITY(1,1) NOT NULL,
	[SubjectId] [bigint] NULL,
	[ExamDate] [date] NULL,
	[TimeSlot] [char](1) NULL,
	[ExamType] [tinyint] NULL,
	[Supervisory] [bigint] NULL,
	[FcReview] [bigint] NULL,
	[FcCheck] [bigint] NULL,
	[PassRate] [nchar](10) NULL,
	[Remarks] [nchar](10) NULL,
	[FcCheckDate] [date] NULL,
	[FcReviewDate] [date] NULL,
	[ExamFile] [varchar](500) NULL,
	[ResultFile] [varchar](500) NULL,
	[ReviewFile] [varchar](500) NULL,
 CONSTRAINT [PK_Exam] PRIMARY KEY CLUSTERED 
(
	[ExamId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[ExamAttendance]    Script Date: 4/13/2015 3:36:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[ExamAttendance](
	[ExamId] [bigint] NOT NULL,
	[StudentId] [bigint] NOT NULL,
	[ExamAttendanceStatus] [tinyint] NULL,
	[TakeTime] [tinyint] NULL,
	[Lab] [varchar](10) NULL,
	[Remarks] [nvarchar](500) NULL,
	[RoomId] [tinyint] NULL,
 CONSTRAINT [PK_ExamAttendance] PRIMARY KEY CLUSTERED 
(
	[ExamId] ASC,
	[StudentId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[FacultyDetails]    Script Date: 4/13/2015 3:36:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[FacultyDetails](
	[FacultyId] [bigint] IDENTITY(1,1) NOT NULL,
	[EmployeeId] [bigint] NULL,
	[Domain] [nvarchar](50) NULL,
	[Quota] [tinyint] NULL,
	[FacultyType] [varchar](10) NULL,
 CONSTRAINT [PK_Faculty] PRIMARY KEY CLUSTERED 
(
	[FacultyId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Location]    Script Date: 4/13/2015 3:36:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Location](
	[LocationId] [tinyint] NOT NULL,
	[LocationName] [varchar](20) NULL,
	[LocationAddress] [nvarchar](150) NULL,
	[Remarks] [nvarchar](150) NULL,
 CONSTRAINT [PK_Location] PRIMARY KEY CLUSTERED 
(
	[LocationId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Room]    Script Date: 4/13/2015 3:36:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Room](
	[RoomId] [tinyint] NOT NULL,
	[RoomName] [nvarchar](20) NULL,
	[Remarks] [nvarchar](50) NULL,
	[RoomType] [tinyint] NULL,
	[LocationId] [tinyint] NULL,
 CONSTRAINT [PK_Room] PRIMARY KEY CLUSTERED 
(
	[RoomId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Student]    Script Date: 4/13/2015 3:36:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Student](
	[StudentId] [bigint] IDENTITY(1,1) NOT NULL,
	[Rollnumber] [char](10) NOT NULL,
	[InitClass] [bigint] NOT NULL,
	[CurrentClass] [bigint] NOT NULL,
	[RollPortal] [varchar](20) NOT NULL,
	[Gender] [smallint] NULL,
	[DateOfBirth] [date] NOT NULL,
	[MobilePhone] [nvarchar](100) NOT NULL,
	[HomePhone] [nvarchar](100) NOT NULL,
	[ContactPhone] [nvarchar](100) NOT NULL,
	[Email] [varchar](150) NULL,
	[Address1] [nvarchar](500) NULL,
	[Address2] [nvarchar](500) NULL,
	[JoiningDate] [date] NULL,
	[OtherSchool] [nvarchar](50) NULL,
	[Remarks] [nvarchar](500) NULL,
	[Promotion] [varchar](20) NULL,
	[Image] [nvarchar](500) NULL,
	[CourseId] [bigint] NULL,
	[Upgrade1] [varchar](50) NULL,
	[Upgrade2] [varchar](50) NULL,
	[FinishDate] [date] NULL,
	[FinishRemarks] [nvarchar](500) NULL,
	[DropoutDate] [date] NULL,
	[DropoutPaymentMethod] [nvarchar](50) NULL,
	[DropoutRemarks] [nvarchar](500) NULL,
	[DropoutFillingDate] [date] NULL,
 CONSTRAINT [PK_Student] PRIMARY KEY CLUSTERED 
(
	[StudentId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[StudentTransferHistory]    Script Date: 4/13/2015 3:36:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[StudentTransferHistory](
	[TransferId] [bigint] NOT NULL,
	[StudentId] [bigint] NULL,
	[FromClass] [bigint] NULL,
	[ToClass] [bigint] NULL,
	[TransferDate] [date] NULL,
	[Remarks] [nvarchar](500) NULL,
 CONSTRAINT [PK_StudentTransferHistory] PRIMARY KEY CLUSTERED 
(
	[TransferId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[StudentUpgradeHistory]    Script Date: 4/13/2015 3:36:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[StudentUpgradeHistory](
	[StudentUpgradeId] [bigint] IDENTITY(1,1) NOT NULL,
	[StudentId] [bigint] NULL,
	[FromCourse] [nvarchar](50) NULL,
	[ToCourse] [nvarchar](50) NULL,
 CONSTRAINT [PK_StudentUpgradeHistory] PRIMARY KEY CLUSTERED 
(
	[StudentUpgradeId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Subject]    Script Date: 4/13/2015 3:36:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Subject](
	[SubjectId] [bigint] NOT NULL,
	[CourseId] [bigint] NULL,
	[SubjectCode] [varchar](50) NULL,
	[Title] [varchar](150) NULL,
	[Semeter] [tinyint] NULL,
	[SubjectOrder] [tinyint] NULL,
	[TotalSession] [tinyint] NULL,
 CONSTRAINT [PK_Subject] PRIMARY KEY CLUSTERED 
(
	[SubjectId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Index [IX_Batch]    Script Date: 4/13/2015 3:36:23 PM ******/
CREATE UNIQUE NONCLUSTERED INDEX [IX_Batch] ON [dbo].[Batch]
(
	[BatchId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Batch] ADD  CONSTRAINT [DF_Batch_GpaOpen]  DEFAULT ((0)) FOR [BatchStatus]
GO
ALTER TABLE [dbo].[BatchSession] ADD  CONSTRAINT [DF_BatchSession_Duration]  DEFAULT ((2)) FOR [Duration]
GO
ALTER TABLE [dbo].[Batch]  WITH CHECK ADD  CONSTRAINT [FK_Batch_ClassUnit] FOREIGN KEY([ClassId])
REFERENCES [dbo].[ClassUnit] ([ClassId])
GO
ALTER TABLE [dbo].[Batch] CHECK CONSTRAINT [FK_Batch_ClassUnit]
GO
ALTER TABLE [dbo].[Batch]  WITH CHECK ADD  CONSTRAINT [FK_Batch_Faculty] FOREIGN KEY([FacultyId])
REFERENCES [dbo].[FacultyDetails] ([FacultyId])
GO
ALTER TABLE [dbo].[Batch] CHECK CONSTRAINT [FK_Batch_Faculty]
GO
ALTER TABLE [dbo].[Batch]  WITH CHECK ADD  CONSTRAINT [FK_Batch_Subject] FOREIGN KEY([SubjectId])
REFERENCES [dbo].[Subject] ([SubjectId])
GO
ALTER TABLE [dbo].[Batch] CHECK CONSTRAINT [FK_Batch_Subject]
GO
ALTER TABLE [dbo].[BatchAttendance]  WITH CHECK ADD  CONSTRAINT [FK_BatchAttendance_BatchSession] FOREIGN KEY([BatchId], [SessionDate])
REFERENCES [dbo].[BatchSession] ([BatchId], [SessionDate])
GO
ALTER TABLE [dbo].[BatchAttendance] CHECK CONSTRAINT [FK_BatchAttendance_BatchSession]
GO
ALTER TABLE [dbo].[BatchAttendance]  WITH CHECK ADD  CONSTRAINT [FK_BatchAttendance_BatchStudentList] FOREIGN KEY([BatchId], [StudentId])
REFERENCES [dbo].[BatchStudentList] ([BatchId], [StudentId])
GO
ALTER TABLE [dbo].[BatchAttendance] CHECK CONSTRAINT [FK_BatchAttendance_BatchStudentList]
GO
ALTER TABLE [dbo].[BatchSession]  WITH CHECK ADD  CONSTRAINT [FK_BatchSession_Batch] FOREIGN KEY([BatchId])
REFERENCES [dbo].[Batch] ([BatchId])
GO
ALTER TABLE [dbo].[BatchSession] CHECK CONSTRAINT [FK_BatchSession_Batch]
GO
ALTER TABLE [dbo].[BatchSession]  WITH CHECK ADD  CONSTRAINT [FK_BatchSession_FacultyDetails] FOREIGN KEY([SubFaculty])
REFERENCES [dbo].[FacultyDetails] ([FacultyId])
GO
ALTER TABLE [dbo].[BatchSession] CHECK CONSTRAINT [FK_BatchSession_FacultyDetails]
GO
ALTER TABLE [dbo].[BatchStudentList]  WITH CHECK ADD  CONSTRAINT [FK_BatchStudentList_Batch] FOREIGN KEY([BatchId])
REFERENCES [dbo].[Batch] ([BatchId])
GO
ALTER TABLE [dbo].[BatchStudentList] CHECK CONSTRAINT [FK_BatchStudentList_Batch]
GO
ALTER TABLE [dbo].[BatchStudentList]  WITH CHECK ADD  CONSTRAINT [FK_BatchStudentList_Student] FOREIGN KEY([StudentId])
REFERENCES [dbo].[Student] ([StudentId])
GO
ALTER TABLE [dbo].[BatchStudentList] CHECK CONSTRAINT [FK_BatchStudentList_Student]
GO
ALTER TABLE [dbo].[ClassOpenHouse]  WITH CHECK ADD  CONSTRAINT [FK_ClassOpenHouse_ClassUnit] FOREIGN KEY([ClassId])
REFERENCES [dbo].[ClassUnit] ([ClassId])
GO
ALTER TABLE [dbo].[ClassOpenHouse] CHECK CONSTRAINT [FK_ClassOpenHouse_ClassUnit]
GO
ALTER TABLE [dbo].[Exam]  WITH CHECK ADD  CONSTRAINT [FK_Exam_Subject] FOREIGN KEY([SubjectId])
REFERENCES [dbo].[Subject] ([SubjectId])
GO
ALTER TABLE [dbo].[Exam] CHECK CONSTRAINT [FK_Exam_Subject]
GO
ALTER TABLE [dbo].[ExamAttendance]  WITH CHECK ADD  CONSTRAINT [FK_ExamAttendance_Exam] FOREIGN KEY([ExamId])
REFERENCES [dbo].[Exam] ([ExamId])
GO
ALTER TABLE [dbo].[ExamAttendance] CHECK CONSTRAINT [FK_ExamAttendance_Exam]
GO
ALTER TABLE [dbo].[ExamAttendance]  WITH CHECK ADD  CONSTRAINT [FK_ExamAttendance_Student] FOREIGN KEY([StudentId])
REFERENCES [dbo].[Student] ([StudentId])
GO
ALTER TABLE [dbo].[ExamAttendance] CHECK CONSTRAINT [FK_ExamAttendance_Student]
GO
ALTER TABLE [dbo].[FacultyDetails]  WITH CHECK ADD  CONSTRAINT [FK_Faculty_Employee] FOREIGN KEY([EmployeeId])
REFERENCES [dbo].[Employee] ([EmployeeId])
GO
ALTER TABLE [dbo].[FacultyDetails] CHECK CONSTRAINT [FK_Faculty_Employee]
GO
ALTER TABLE [dbo].[Room]  WITH CHECK ADD  CONSTRAINT [FK_Room_Location] FOREIGN KEY([LocationId])
REFERENCES [dbo].[Location] ([LocationId])
GO
ALTER TABLE [dbo].[Room] CHECK CONSTRAINT [FK_Room_Location]
GO
ALTER TABLE [dbo].[Student]  WITH CHECK ADD  CONSTRAINT [FK_Student_Clazz] FOREIGN KEY([InitClass])
REFERENCES [dbo].[ClassUnit] ([ClassId])
GO
ALTER TABLE [dbo].[Student] CHECK CONSTRAINT [FK_Student_Clazz]
GO
ALTER TABLE [dbo].[Student]  WITH CHECK ADD  CONSTRAINT [FK_Student_Clazz1] FOREIGN KEY([CurrentClass])
REFERENCES [dbo].[ClassUnit] ([ClassId])
GO
ALTER TABLE [dbo].[Student] CHECK CONSTRAINT [FK_Student_Clazz1]
GO
ALTER TABLE [dbo].[Student]  WITH CHECK ADD  CONSTRAINT [FK_Student_Course] FOREIGN KEY([CourseId])
REFERENCES [dbo].[Course] ([CourseId])
GO
ALTER TABLE [dbo].[Student] CHECK CONSTRAINT [FK_Student_Course]
GO
ALTER TABLE [dbo].[StudentTransferHistory]  WITH CHECK ADD  CONSTRAINT [FK_StudentTransferHistory_Student] FOREIGN KEY([StudentId])
REFERENCES [dbo].[Student] ([StudentId])
GO
ALTER TABLE [dbo].[StudentTransferHistory] CHECK CONSTRAINT [FK_StudentTransferHistory_Student]
GO
ALTER TABLE [dbo].[Subject]  WITH CHECK ADD  CONSTRAINT [FK_Subject_Course1] FOREIGN KEY([CourseId])
REFERENCES [dbo].[Course] ([CourseId])
GO
ALTER TABLE [dbo].[Subject] CHECK CONSTRAINT [FK_Subject_Course1]
GO

ALTER DATABASE [StudentLog_dev] SET  READ_WRITE 
GO

go
insert into Employee values('Nguyen Hoang Viet','123','mrlytieudao@gmail.com','mrlytieudao@gmail.com','16-5-1987',GETDATE(),'123',1)
insert into Employee values('Nguyen Hoang Long','123','Long@gmail.com','Long@gmail.com','16-5-1995',GETDATE(),'123',0)
insert into Employee values('Nguyen van tuan','123','tuan@gmail.com','tuan@gmail.com','16-5-1995',GETDATE(),'123',2)

go
insert into Course values(2011,'ACCP2011',2015,'Working',1)
insert into Course values(2010,'ACCP2010',2013,'End',0)
insert into Course values(2013,'ACCP2013',2020,'Working',1)

go
insert into Subject values(1,2011,'JAVA1','Programing with java',2,10,48)
insert into Subject values(2,2011,'APJ1','Advanced Programing with java',2,10,50)
insert into Subject values(3,2011,'APJ2','Avanced Programing with java 2',2,10,70)
insert into Subject values(4,2011,'WPSJ','Programing with JSP and Servlet',4,10,48)
insert into Subject values(5,2011,'AWAJS','Architecting Web Applications Using JSF and Struts',4,10,48)


go
select * from Course where CourseCode like '%' + '0' + '%'

select * from Subject a inner join Course b on b.CourseId=a.CourseId

go
select * from Batch
select * from BatchAttendance
select * from BatchSession
select * from BatchStudentList
select * from ClassOpenHouse
select * from ClassUnit
select * from Exam
select * from ExamAttendance
select * from FacultyDetails
select * from Location
select * from Room
select * from Student
select * from StudentTransferHistory
select * from StudentUpgradeHistory

select * from Employee   ---here now
select * from Course     --here now
select * from Subject  --Here Now