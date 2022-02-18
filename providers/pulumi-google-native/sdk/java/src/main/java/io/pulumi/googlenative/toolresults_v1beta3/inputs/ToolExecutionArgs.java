// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.FileReferenceArgs;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.ToolExitCodeArgs;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.ToolOutputReferenceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An execution of an arbitrary tool. It could be a test runner or a tool copying artifacts or deploying code.
 * 
 */
public final class ToolExecutionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ToolExecutionArgs Empty = new ToolExecutionArgs();

    /**
     * The full tokenized command line including the program name (equivalent to argv in a C program). - In response: present if set by create request - In create request: optional - In update request: never set
     * 
     */
    @InputImport(name="commandLineArguments")
    private final @Nullable Input<List<String>> commandLineArguments;

    public Input<List<String>> getCommandLineArguments() {
        return this.commandLineArguments == null ? Input.empty() : this.commandLineArguments;
    }

    /**
     * Tool execution exit code. This field will be set once the tool has exited. - In response: present if set by create/update request - In create request: optional - In update request: optional, a FAILED_PRECONDITION error will be returned if an exit_code is already set.
     * 
     */
    @InputImport(name="exitCode")
    private final @Nullable Input<ToolExitCodeArgs> exitCode;

    public Input<ToolExitCodeArgs> getExitCode() {
        return this.exitCode == null ? Input.empty() : this.exitCode;
    }

    /**
     * References to any plain text logs output the tool execution. This field can be set before the tool has exited in order to be able to have access to a live view of the logs while the tool is running. The maximum allowed number of tool logs per step is 1000. - In response: present if set by create/update request - In create request: optional - In update request: optional, any value provided will be appended to the existing list
     * 
     */
    @InputImport(name="toolLogs")
    private final @Nullable Input<List<FileReferenceArgs>> toolLogs;

    public Input<List<FileReferenceArgs>> getToolLogs() {
        return this.toolLogs == null ? Input.empty() : this.toolLogs;
    }

    /**
     * References to opaque files of any format output by the tool execution. The maximum allowed number of tool outputs per step is 1000. - In response: present if set by create/update request - In create request: optional - In update request: optional, any value provided will be appended to the existing list
     * 
     */
    @InputImport(name="toolOutputs")
    private final @Nullable Input<List<ToolOutputReferenceArgs>> toolOutputs;

    public Input<List<ToolOutputReferenceArgs>> getToolOutputs() {
        return this.toolOutputs == null ? Input.empty() : this.toolOutputs;
    }

    public ToolExecutionArgs(
        @Nullable Input<List<String>> commandLineArguments,
        @Nullable Input<ToolExitCodeArgs> exitCode,
        @Nullable Input<List<FileReferenceArgs>> toolLogs,
        @Nullable Input<List<ToolOutputReferenceArgs>> toolOutputs) {
        this.commandLineArguments = commandLineArguments;
        this.exitCode = exitCode;
        this.toolLogs = toolLogs;
        this.toolOutputs = toolOutputs;
    }

    private ToolExecutionArgs() {
        this.commandLineArguments = Input.empty();
        this.exitCode = Input.empty();
        this.toolLogs = Input.empty();
        this.toolOutputs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ToolExecutionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> commandLineArguments;
        private @Nullable Input<ToolExitCodeArgs> exitCode;
        private @Nullable Input<List<FileReferenceArgs>> toolLogs;
        private @Nullable Input<List<ToolOutputReferenceArgs>> toolOutputs;

        public Builder() {
    	      // Empty
        }

        public Builder(ToolExecutionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commandLineArguments = defaults.commandLineArguments;
    	      this.exitCode = defaults.exitCode;
    	      this.toolLogs = defaults.toolLogs;
    	      this.toolOutputs = defaults.toolOutputs;
        }

        public Builder setCommandLineArguments(@Nullable Input<List<String>> commandLineArguments) {
            this.commandLineArguments = commandLineArguments;
            return this;
        }

        public Builder setCommandLineArguments(@Nullable List<String> commandLineArguments) {
            this.commandLineArguments = Input.ofNullable(commandLineArguments);
            return this;
        }

        public Builder setExitCode(@Nullable Input<ToolExitCodeArgs> exitCode) {
            this.exitCode = exitCode;
            return this;
        }

        public Builder setExitCode(@Nullable ToolExitCodeArgs exitCode) {
            this.exitCode = Input.ofNullable(exitCode);
            return this;
        }

        public Builder setToolLogs(@Nullable Input<List<FileReferenceArgs>> toolLogs) {
            this.toolLogs = toolLogs;
            return this;
        }

        public Builder setToolLogs(@Nullable List<FileReferenceArgs> toolLogs) {
            this.toolLogs = Input.ofNullable(toolLogs);
            return this;
        }

        public Builder setToolOutputs(@Nullable Input<List<ToolOutputReferenceArgs>> toolOutputs) {
            this.toolOutputs = toolOutputs;
            return this;
        }

        public Builder setToolOutputs(@Nullable List<ToolOutputReferenceArgs> toolOutputs) {
            this.toolOutputs = Input.ofNullable(toolOutputs);
            return this;
        }

        public ToolExecutionArgs build() {
            return new ToolExecutionArgs(commandLineArguments, exitCode, toolLogs, toolOutputs);
        }
    }
}
