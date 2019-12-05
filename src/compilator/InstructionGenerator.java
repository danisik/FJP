package compilator;

import compilator.compilerPart.ProgramCompiler;
import compilator.object.Program;


public class InstructionGenerator
{

    private Program program;

    public InstructionGenerator(Program program)
    {
        this.program = program;
    }

    public void generateInstructions()
    {
        new ProgramCompiler(this.program).run();


    }
}
