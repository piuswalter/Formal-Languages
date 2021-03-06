// $ANTLR 3.1.2 /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g 2009-10-22 15:40:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class exprLexer extends Lexer {
    public static final int T__7=7;
    public static final int T__12=12;
    public static final int INT=5;
    public static final int T__8=8;
    public static final int WS=6;
    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int T__9=9;
    public static final int T__11=11;
    public static final int ID=4;

    // delegates
    // delegators

    public exprLexer() {;} 
    public exprLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public exprLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:3:6: ( '=' )
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:3:8: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:4:6: ( '+' )
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:4:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:5:6: ( '-' )
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:5:8: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:6:7: ( '*' )
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:6:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:7:7: ( '/' )
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:7:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:8:7: ( '(' )
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:8:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:9:7: ( ')' )
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:9:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:23:5: ( ( '1' .. '9' ) ( '0' .. '9' )* )
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:23:7: ( '1' .. '9' ) ( '0' .. '9' )*
            {
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:23:7: ( '1' .. '9' )
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:23:8: '1' .. '9'
            {
            matchRange('1','9'); 

            }

            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:23:20: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:23:21: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:25:5: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+ )
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:25:7: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+
            {
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:25:7: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='A' && LA2_0<='Z')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:25:8: ( 'a' .. 'z' )
            	    {
            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:25:8: ( 'a' .. 'z' )
            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:25:9: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:25:23: ( 'A' .. 'Z' )
            	    {
            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:25:23: ( 'A' .. 'Z' )
            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:25:24: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:27:5: ( ( ' ' | '\\n' | '\\r' | '\\t' ) )
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:27:7: ( ' ' | '\\n' | '\\r' | '\\t' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | INT | ID | WS )
        int alt3=10;
        switch ( input.LA(1) ) {
        case '=':
            {
            alt3=1;
            }
            break;
        case '+':
            {
            alt3=2;
            }
            break;
        case '-':
            {
            alt3=3;
            }
            break;
        case '*':
            {
            alt3=4;
            }
            break;
        case '/':
            {
            alt3=5;
            }
            break;
        case '(':
            {
            alt3=6;
            }
            break;
        case ')':
            {
            alt3=7;
            }
            break;
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt3=8;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt3=9;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt3=10;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;
        }

        switch (alt3) {
            case 1 :
                // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:1:10: T__7
                {
                mT__7(); 

                }
                break;
            case 2 :
                // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:1:15: T__8
                {
                mT__8(); 

                }
                break;
            case 3 :
                // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:1:20: T__9
                {
                mT__9(); 

                }
                break;
            case 4 :
                // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:1:25: T__10
                {
                mT__10(); 

                }
                break;
            case 5 :
                // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:1:31: T__11
                {
                mT__11(); 

                }
                break;
            case 6 :
                // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:1:37: T__12
                {
                mT__12(); 

                }
                break;
            case 7 :
                // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:1:43: T__13
                {
                mT__13(); 

                }
                break;
            case 8 :
                // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:1:49: INT
                {
                mINT(); 

                }
                break;
            case 9 :
                // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:1:53: ID
                {
                mID(); 

                }
                break;
            case 10 :
                // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:1:56: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}