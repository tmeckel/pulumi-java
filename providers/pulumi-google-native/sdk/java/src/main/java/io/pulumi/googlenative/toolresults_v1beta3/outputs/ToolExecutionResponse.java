// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.FileReferenceResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.ToolExitCodeResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.ToolOutputReferenceResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ToolExecutionResponse {
    /**
     * The full tokenized command line including the program name (equivalent to argv in a C program). - In response: present if set by create request - In create request: optional - In update request: never set
     * 
     */
    private final List<String> commandLineArguments;
    /**
     * Tool execution exit code. This field will be set once the tool has exited. - In response: present if set by create/update request - In create request: optional - In update request: optional, a FAILED_PRECONDITION error will be returned if an exit_code is already set.
     * 
     */
    private final ToolExitCodeResponse exitCode;
    /**
     * References to any plain text logs output the tool execution. This field can be set before the tool has exited in order to be able to have access to a live view of the logs while the tool is running. The maximum allowed number of tool logs per step is 1000. - In response: present if set by create/update request - In create request: optional - In update request: optional, any value provided will be appended to the existing list
     * 
     */
    private final List<FileReferenceResponse> toolLogs;
    /**
     * References to opaque files of any format output by the tool execution. The maximum allowed number of tool outputs per step is 1000. - In response: present if set by create/update request - In create request: optional - In update request: optional, any value provided will be appended to the existing list
     * 
     */
    private final List<ToolOutputReferenceResponse> toolOutputs;

    @OutputCustomType.Constructor({"commandLineArguments","exitCode","toolLogs","toolOutputs"})
    private ToolExecutionResponse(
        List<String> commandLineArguments,
        ToolExitCodeResponse exitCode,
        List<FileReferenceResponse> toolLogs,
        List<ToolOutputReferenceResponse> toolOutputs) {
        this.commandLineArguments = Objects.requireNonNull(commandLineArguments);
        this.exitCode = Objects.requireNonNull(exitCode);
        this.toolLogs = Objects.requireNonNull(toolLogs);
        this.toolOutputs = Objects.requireNonNull(toolOutputs);
    }

    /**
     * The full tokenized command line including the program name (equivalent to argv in a C program). - In response: present if set by create request - In create request: optional - In update request: never set
     * 
     */
    public List<String> getCommandLineArguments() {
        return this.commandLineArguments;
    }
    /**
     * Tool execution exit code. This field will be set once the tool has exited. - In response: present if set by create/update request - In create request: optional - In update request: optional, a FAILED_PRECONDITION error will be returned if an exit_code is already set.
     * 
     */
    public ToolExitCodeResponse getExitCode() {
        return this.exitCode;
    }
    /**
     * References to any plain text logs output the tool execution. This field can be set before the tool has exited in order to be able to have access to a live view of the logs while the tool is running. The maximum allowed number of tool logs per step is 1000. - In response: present if set by create/update request - In create request: optional - In update request: optional, any value provided will be appended to the existing list
     * 
     */
    public List<FileReferenceResponse> getToolLogs() {
        return this.toolLogs;
    }
    /**
     * References to opaque files of any format output by the tool execution. The maximum allowed number of tool outputs per step is 1000. - In response: present if set by create/update request - In create request: optional - In update request: optional, any value provided will be appended to the existing list
     * 
     */
    public List<ToolOutputReferenceResponse> getToolOutputs() {
        return this.toolOutputs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ToolExecutionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> commandLineArguments;
        private ToolExitCodeResponse exitCode;
        private List<FileReferenceResponse> toolLogs;
        private List<ToolOutputReferenceResponse> toolOutputs;

        public Builder() {
    	      // Empty
        }

        public Builder(ToolExecutionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commandLineArguments = defaults.commandLineArguments;
    	      this.exitCode = defaults.exitCode;
    	      this.toolLogs = defaults.toolLogs;
    	      this.toolOutputs = defaults.toolOutputs;
        }

        public Builder setCommandLineArguments(List<String> commandLineArguments) {
            this.commandLineArguments = Objects.requireNonNull(commandLineArguments);
            return this;
        }

        public Builder setExitCode(ToolExitCodeResponse exitCode) {
            this.exitCode = Objects.requireNonNull(exitCode);
            return this;
        }

        public Builder setToolLogs(List<FileReferenceResponse> toolLogs) {
            this.toolLogs = Objects.requireNonNull(toolLogs);
            return this;
        }

        public Builder setToolOutputs(List<ToolOutputReferenceResponse> toolOutputs) {
            this.toolOutputs = Objects.requireNonNull(toolOutputs);
            return this;
        }

        public ToolExecutionResponse build() {
            return new ToolExecutionResponse(commandLineArguments, exitCode, toolLogs, toolOutputs);
        }
    }
}
