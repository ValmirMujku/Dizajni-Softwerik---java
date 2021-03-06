USE [master]
GO
/****** Object:  Database [DizajnDB]    Script Date: 03-Feb-19 5:01:38 PM ******/
CREATE DATABASE [DizajnDB]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'DizajnDB', FILENAME = N'c:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\DizajnDB.mdf' , SIZE = 3136KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'DizajnDB_log', FILENAME = N'c:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\DizajnDB_log.ldf' , SIZE = 832KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [DizajnDB] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [DizajnDB].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [DizajnDB] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [DizajnDB] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [DizajnDB] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [DizajnDB] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [DizajnDB] SET ARITHABORT OFF 
GO
ALTER DATABASE [DizajnDB] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [DizajnDB] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [DizajnDB] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [DizajnDB] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [DizajnDB] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [DizajnDB] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [DizajnDB] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [DizajnDB] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [DizajnDB] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [DizajnDB] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [DizajnDB] SET  ENABLE_BROKER 
GO
ALTER DATABASE [DizajnDB] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [DizajnDB] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [DizajnDB] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [DizajnDB] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [DizajnDB] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [DizajnDB] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [DizajnDB] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [DizajnDB] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [DizajnDB] SET  MULTI_USER 
GO
ALTER DATABASE [DizajnDB] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [DizajnDB] SET DB_CHAINING OFF 
GO
ALTER DATABASE [DizajnDB] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [DizajnDB] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [DizajnDB]
GO
/****** Object:  Table [dbo].[Drejtimi]    Script Date: 03-Feb-19 5:01:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Drejtimi](
	[Drejtimi_ID] [int] IDENTITY(1,1) NOT NULL,
	[Emri] [varchar](40) NOT NULL,
 CONSTRAINT [drejtimi_pk] PRIMARY KEY CLUSTERED 
(
	[Drejtimi_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Eventi]    Script Date: 03-Feb-19 5:01:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Eventi](
	[Eventi_ID] [int] IDENTITY(1,1) NOT NULL,
	[Drejtimie] [int] NOT NULL,
	[Lendae] [int] NOT NULL,
	[Profesorie] [int] NOT NULL,
	[Anetaret] [varchar](140) NOT NULL,
	[Data] [datetime] NULL,
 CONSTRAINT [eventi_pk] PRIMARY KEY CLUSTERED 
(
	[Eventi_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Lenda]    Script Date: 03-Feb-19 5:01:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Lenda](
	[Lenda_ID] [int] IDENTITY(1,1) NOT NULL,
	[Emri] [varchar](40) NOT NULL,
 CONSTRAINT [lenda_pk] PRIMARY KEY CLUSTERED 
(
	[Lenda_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Librat]    Script Date: 03-Feb-19 5:01:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Librat](
	[Librat_ID] [int] IDENTITY(1,1) NOT NULL,
	[Emri] [varchar](30) NULL,
	[Autori] [varchar](30) NULL,
	[ISSN] [int] NULL,
	[LEXO] [varchar](40) NULL,
 CONSTRAINT [librat_pk] PRIMARY KEY CLUSTERED 
(
	[Librat_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Pagesa]    Script Date: 03-Feb-19 5:01:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Pagesa](
	[pagesa_id] [int] IDENTITY(1,1) NOT NULL,
	[digitsnumbers] [bigint] NOT NULL,
	[CVV] [int] NOT NULL,
	[Shuma] [decimal](5, 2) NULL,
 CONSTRAINT [pagesa_pk] PRIMARY KEY CLUSTERED 
(
	[pagesa_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Profesori]    Script Date: 03-Feb-19 5:01:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Profesori](
	[Profesori_ID] [int] IDENTITY(1,1) NOT NULL,
	[Emri] [varchar](40) NOT NULL,
 CONSTRAINT [profesori_pk] PRIMARY KEY CLUSTERED 
(
	[Profesori_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Revistat]    Script Date: 03-Feb-19 5:01:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Revistat](
	[Revistat_id] [int] IDENTITY(1,1) NOT NULL,
	[Emri] [varchar](30) NULL,
	[Botuesi] [varchar](30) NULL,
	[ISSN] [int] NULL,
 CONSTRAINT [revistat_pk] PRIMARY KEY CLUSTERED 
(
	[Revistat_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Drejtimi] ON 

INSERT [dbo].[Drejtimi] ([Drejtimi_ID], [Emri]) VALUES (1, N'SHKI')
INSERT [dbo].[Drejtimi] ([Drejtimi_ID], [Emri]) VALUES (2, N'Arkitekture dhe Dizajn')
SET IDENTITY_INSERT [dbo].[Drejtimi] OFF
SET IDENTITY_INSERT [dbo].[Eventi] ON 

INSERT [dbo].[Eventi] ([Eventi_ID], [Drejtimie], [Lendae], [Profesorie], [Anetaret], [Data]) VALUES (1, 1, 1, 1, N'anterati 1 2 3 ', CAST(0x0000A9E80166A317 AS DateTime))
INSERT [dbo].[Eventi] ([Eventi_ID], [Drejtimie], [Lendae], [Profesorie], [Anetaret], [Data]) VALUES (2, 1, 1, 3, N'qweqwe', CAST(0x0000A9E9000652E0 AS DateTime))
SET IDENTITY_INSERT [dbo].[Eventi] OFF
SET IDENTITY_INSERT [dbo].[Lenda] ON 

INSERT [dbo].[Lenda] ([Lenda_ID], [Emri]) VALUES (1, N'Dizajn Softwerik')
INSERT [dbo].[Lenda] ([Lenda_ID], [Emri]) VALUES (2, N'Shkenca Kompjuterike')
SET IDENTITY_INSERT [dbo].[Lenda] OFF
SET IDENTITY_INSERT [dbo].[Librat] ON 

INSERT [dbo].[Librat] ([Librat_ID], [Emri], [Autori], [ISSN], [LEXO]) VALUES (1, N'SHKI 1', N'Autori 1', 1234, N'lexo/shkarko')
INSERT [dbo].[Librat] ([Librat_ID], [Emri], [Autori], [ISSN], [LEXO]) VALUES (2, N'SHKI 2', N'Autori 2', 3213, N'lexo/shkarko')
INSERT [dbo].[Librat] ([Librat_ID], [Emri], [Autori], [ISSN], [LEXO]) VALUES (3, N'SHKI 3', N'Autori 3', 4312, N'lexo/shkarko')
INSERT [dbo].[Librat] ([Librat_ID], [Emri], [Autori], [ISSN], [LEXO]) VALUES (4, N'libri', N'autori', 3123, N'lexo/shkarko ')
SET IDENTITY_INSERT [dbo].[Librat] OFF
SET IDENTITY_INSERT [dbo].[Pagesa] ON 

INSERT [dbo].[Pagesa] ([pagesa_id], [digitsnumbers], [CVV], [Shuma]) VALUES (1, 1111444455556666, 232, CAST(125.00 AS Decimal(5, 2)))
INSERT [dbo].[Pagesa] ([pagesa_id], [digitsnumbers], [CVV], [Shuma]) VALUES (2, 1252121212125555, 312, CAST(585.00 AS Decimal(5, 2)))
SET IDENTITY_INSERT [dbo].[Pagesa] OFF
SET IDENTITY_INSERT [dbo].[Profesori] ON 

INSERT [dbo].[Profesori] ([Profesori_ID], [Emri]) VALUES (1, N'Edmond Jahjaga')
INSERT [dbo].[Profesori] ([Profesori_ID], [Emri]) VALUES (2, N'Fatos Maxhuni')
INSERT [dbo].[Profesori] ([Profesori_ID], [Emri]) VALUES (3, N'Bertan Karahoda')
SET IDENTITY_INSERT [dbo].[Profesori] OFF
SET IDENTITY_INSERT [dbo].[Revistat] ON 

INSERT [dbo].[Revistat] ([Revistat_id], [Emri], [Botuesi], [ISSN]) VALUES (1, N'Revistat 1', N'Botuesi 1', 1111)
INSERT [dbo].[Revistat] ([Revistat_id], [Emri], [Botuesi], [ISSN]) VALUES (2, N'Revistat 2', N'Botuesi 2', 2222)
INSERT [dbo].[Revistat] ([Revistat_id], [Emri], [Botuesi], [ISSN]) VALUES (3, N'Revistat 3', N'Botuesi 3', 3333)
SET IDENTITY_INSERT [dbo].[Revistat] OFF
ALTER TABLE [dbo].[Eventi]  WITH CHECK ADD  CONSTRAINT [eventi_fk] FOREIGN KEY([Drejtimie])
REFERENCES [dbo].[Drejtimi] ([Drejtimi_ID])
GO
ALTER TABLE [dbo].[Eventi] CHECK CONSTRAINT [eventi_fk]
GO
ALTER TABLE [dbo].[Eventi]  WITH CHECK ADD  CONSTRAINT [eventi_fk2] FOREIGN KEY([Lendae])
REFERENCES [dbo].[Lenda] ([Lenda_ID])
GO
ALTER TABLE [dbo].[Eventi] CHECK CONSTRAINT [eventi_fk2]
GO
ALTER TABLE [dbo].[Eventi]  WITH CHECK ADD  CONSTRAINT [eventi_fk3] FOREIGN KEY([Profesorie])
REFERENCES [dbo].[Profesori] ([Profesori_ID])
GO
ALTER TABLE [dbo].[Eventi] CHECK CONSTRAINT [eventi_fk3]
GO
USE [master]
GO
ALTER DATABASE [DizajnDB] SET  READ_WRITE 
GO
