package org.jetbrains.fortran.lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.fortran.FortranLanguage;
import org.jetbrains.fortran.lang.FortranTypes;

import static com.intellij.psi.TokenType.WHITE_SPACE;
import static org.jetbrains.fortran.lang.FortranTypes.*;

/**
 * Created by sergei on 13.03.17.
 * to have keywords highlighting
 * parameters type keywords must be deleted from here
 */
public class FortranTokenType extends IElementType {
    public FortranTokenType(String debug) {
        super(debug, FortranLanguage.INSTANCE);
    }

    public static IElementType LINE_COMMENT = new FortranTokenType("comment");

    public static IElementType FIRST_WHITE_SPACE = new FortranTokenType("white_space");

    public static IElementType LINE_CONTINUE = new FortranTokenType("line_continue");

    public static IElementType WORD = new FortranTokenType("identifier_or_keyword");

    public static IElementType CPP = new FortranTokenType("c_pre_processor");

    public static TokenSet KEYWORDS = TokenSet.create(
            ABSTRACT,
            ACCEPT,
            ALL,
            ALLOCATE,
            ALLOCATABLE,
            ASSIGN,
            ASSIGNMENT,
            ASSOCIATE,
            ASYNCHRONOUS,
            BACKSPACE,
            BIND,
            BLOCKKWD,
            BLOCKDATA,
            BYTE,
            CALL,
            CASE,
            CHARACTER,
            CLASSKWD,
            CLOSE,
            CODIMENSION,
            COMPLEX,
            COMMON,
            CONCURRENT,
            CONTAINS,
            CONTIGUOUS,
            CONTINUE,
            CRITICAL,
            CYCLE,
            DATA,
            DECODE,
            DEALLOCATE,
            DEFAULT,
            DEFERRED,
            DIMENSION,
            DO,
            DOUBLE,
            DOUBLEPRECISION,
            ELEMENTAL,
            ELSE,
            ELSEIF,
            ELSEWHERE,
            ENTRY,
            END,
            ENDASSOCIATE,
            ENDBLOCK,
            ENDBLOCKDATA,
            ENDCRITICAL,
            ENDDO,
            ENDENUM,
            ENDFILE,
            ENDFORALL,
            ENDFUNCTION,
            ENDIF,
            ENDINTERFACE,
            ENDMODULE,
            ENDPROCEDURE,
            ENDPROGRAM,
            ENDSELECT,
            ENDSUBMODULE,
            ENDSUBROUTINE,
            ENDTYPE,
            ENDWHERE,
            ENTRY,
            ENUM,
            ENUMERATORKWD,
            ERROR,
            EQUIVALENCE,
            EXIT,
            EXTENDS,
            EXTERNALKWD,
            FINAL,
            FLUSH,
            FORALL,
            FORMATKWD,
            FORMATTED,
            FUNCTION,
            GENERIC,
            GO,
            GOTO,
            IF,
            IMAGES,
            IMPLICIT,
            IMPORT,
            IMPURE,
            IN,
            INCLUDE,
            INOUT,
            INTEGER,
            INTENT,
            INTERFACE,
            INTRINSIC,
            INQUIRE,
            IOLENGTH,
            IS,
            KIND,
            LEN,
            LOCK,
            LOGICAL,
            MEMORY,
            MODULEKWD,
            NAMEKWD,
            NAMELIST,
            NONE,
            NONINTRINSIC,
            NONOVERRIDABLE,
            NOPASS,
            NULLIFY,
            ONLY,
            OPEN,
            OPERATOR,
            OPTIONAL,
            OUT,
            PARAMETER,
            PASS,
            PAUSE,
            POINTER,
            PRECISION,
            PRINT,
            PRIVATEKWD,
            PROCEDURE,
            PROGRAMKWD,
            PROTECTED,
            PUBLICKWD,
            PURE,
            READ,
            REAL,
            RECURSIVE,
            RESULT,
            RETURNKWD,
            REWIND,
            SAVE,
            SELECT,
            SEQUENCE,
            STOP,
            SYNC,
            SYNCALL,
            SYNCIMAGES,
            SYNCMEMORY,
            SUBROUTINE,
            SUBMODULE,
            TARGET,
            THEN,
            TO,
            TYPE,
            UNFORMATTED,
            UNLOCK,
            USE,
            VALUE,
            VOLATILE,
            WAIT,
            WHERE,
            WHILE,
            WRITE
    );

//    public static TokenSet SOFT_KEYWORDS = TokenSet.create(NONE_KEYWORD, END_KEYWORD, FILE_KEYWORD);

    public static TokenSet WHITE_SPACES = TokenSet.create(WHITE_SPACE, FIRST_WHITE_SPACE);

    public static TokenSet COMMENTS = TokenSet.create(LINE_COMMENT, CPP, LINE_CONTINUE);

    public static TokenSet STRINGS = TokenSet.create(STRINGLITERAL);

// These keywords are used for specification parameters names
// We'll use them one day
/*   public static TokenSet PARAM_KEYWORDS = TokenSet.create(
        ACCESS,
        ACTION,
        ACQUIRED,
        ADVANCE,
        BLANK,
        DECIMAL,
        DELIM,
        DIRECT,
        ENCODING,
        EOR,
        ERR,
        ERRMSG,
        EXIST,
        FILE,
        FMT,
        FORM,
        ID,
        IOMSG,
        IOSTAT,
        NAMED,
        NEXTREC,
        NEWUNIT,
        NML,
        NUMBER,
        OPENED,
        PAD,
        PENDING,
        POS,
        POSITION,
        READWRITE,
        REC,
        RECL,
        ROUND,
        SEQUENTIAL,
        SIGN,
        SIZE,
        STAT,
        STATUS,
        STREAM,
        UNIT
    );*/
}