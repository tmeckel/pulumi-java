// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dataflow_v1b3.inputs.WorkerSettingsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Taskrunner configuration settings.
 * 
 */
public final class TaskRunnerSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskRunnerSettingsArgs Empty = new TaskRunnerSettingsArgs();

    /**
     * Whether to also send taskrunner log info to stderr.
     * 
     */
    @Import(name="alsologtostderr")
      private final @Nullable Output<Boolean> alsologtostderr;

    public Output<Boolean> getAlsologtostderr() {
        return this.alsologtostderr == null ? Codegen.empty() : this.alsologtostderr;
    }

    /**
     * The location on the worker for task-specific subdirectories.
     * 
     */
    @Import(name="baseTaskDir")
      private final @Nullable Output<String> baseTaskDir;

    public Output<String> getBaseTaskDir() {
        return this.baseTaskDir == null ? Codegen.empty() : this.baseTaskDir;
    }

    /**
     * The base URL for the taskrunner to use when accessing Google Cloud APIs. When workers access Google Cloud APIs, they logically do so via relative URLs. If this field is specified, it supplies the base URL to use for resolving these relative URLs. The normative algorithm used is defined by RFC 1808, "Relative Uniform Resource Locators". If not specified, the default value is "http://www.googleapis.com/"
     * 
     */
    @Import(name="baseUrl")
      private final @Nullable Output<String> baseUrl;

    public Output<String> getBaseUrl() {
        return this.baseUrl == null ? Codegen.empty() : this.baseUrl;
    }

    /**
     * The file to store preprocessing commands in.
     * 
     */
    @Import(name="commandlinesFileName")
      private final @Nullable Output<String> commandlinesFileName;

    public Output<String> getCommandlinesFileName() {
        return this.commandlinesFileName == null ? Codegen.empty() : this.commandlinesFileName;
    }

    /**
     * Whether to continue taskrunner if an exception is hit.
     * 
     */
    @Import(name="continueOnException")
      private final @Nullable Output<Boolean> continueOnException;

    public Output<Boolean> getContinueOnException() {
        return this.continueOnException == null ? Codegen.empty() : this.continueOnException;
    }

    /**
     * The API version of endpoint, e.g. "v1b3"
     * 
     */
    @Import(name="dataflowApiVersion")
      private final @Nullable Output<String> dataflowApiVersion;

    public Output<String> getDataflowApiVersion() {
        return this.dataflowApiVersion == null ? Codegen.empty() : this.dataflowApiVersion;
    }

    /**
     * The command to launch the worker harness.
     * 
     */
    @Import(name="harnessCommand")
      private final @Nullable Output<String> harnessCommand;

    public Output<String> getHarnessCommand() {
        return this.harnessCommand == null ? Codegen.empty() : this.harnessCommand;
    }

    /**
     * The suggested backend language.
     * 
     */
    @Import(name="languageHint")
      private final @Nullable Output<String> languageHint;

    public Output<String> getLanguageHint() {
        return this.languageHint == null ? Codegen.empty() : this.languageHint;
    }

    /**
     * The directory on the VM to store logs.
     * 
     */
    @Import(name="logDir")
      private final @Nullable Output<String> logDir;

    public Output<String> getLogDir() {
        return this.logDir == null ? Codegen.empty() : this.logDir;
    }

    /**
     * Whether to send taskrunner log info to Google Compute Engine VM serial console.
     * 
     */
    @Import(name="logToSerialconsole")
      private final @Nullable Output<Boolean> logToSerialconsole;

    public Output<Boolean> getLogToSerialconsole() {
        return this.logToSerialconsole == null ? Codegen.empty() : this.logToSerialconsole;
    }

    /**
     * Indicates where to put logs. If this is not specified, the logs will not be uploaded. The supported resource type is: Google Cloud Storage: storage.googleapis.com/{bucket}/{object} bucket.storage.googleapis.com/{object}
     * 
     */
    @Import(name="logUploadLocation")
      private final @Nullable Output<String> logUploadLocation;

    public Output<String> getLogUploadLocation() {
        return this.logUploadLocation == null ? Codegen.empty() : this.logUploadLocation;
    }

    /**
     * The OAuth2 scopes to be requested by the taskrunner in order to access the Cloud Dataflow API.
     * 
     */
    @Import(name="oauthScopes")
      private final @Nullable Output<List<String>> oauthScopes;

    public Output<List<String>> getOauthScopes() {
        return this.oauthScopes == null ? Codegen.empty() : this.oauthScopes;
    }

    /**
     * The settings to pass to the parallel worker harness.
     * 
     */
    @Import(name="parallelWorkerSettings")
      private final @Nullable Output<WorkerSettingsArgs> parallelWorkerSettings;

    public Output<WorkerSettingsArgs> getParallelWorkerSettings() {
        return this.parallelWorkerSettings == null ? Codegen.empty() : this.parallelWorkerSettings;
    }

    /**
     * The streaming worker main class name.
     * 
     */
    @Import(name="streamingWorkerMainClass")
      private final @Nullable Output<String> streamingWorkerMainClass;

    public Output<String> getStreamingWorkerMainClass() {
        return this.streamingWorkerMainClass == null ? Codegen.empty() : this.streamingWorkerMainClass;
    }

    /**
     * The UNIX group ID on the worker VM to use for tasks launched by taskrunner; e.g. "wheel".
     * 
     */
    @Import(name="taskGroup")
      private final @Nullable Output<String> taskGroup;

    public Output<String> getTaskGroup() {
        return this.taskGroup == null ? Codegen.empty() : this.taskGroup;
    }

    /**
     * The UNIX user ID on the worker VM to use for tasks launched by taskrunner; e.g. "root".
     * 
     */
    @Import(name="taskUser")
      private final @Nullable Output<String> taskUser;

    public Output<String> getTaskUser() {
        return this.taskUser == null ? Codegen.empty() : this.taskUser;
    }

    /**
     * The prefix of the resources the taskrunner should use for temporary storage. The supported resource type is: Google Cloud Storage: storage.googleapis.com/{bucket}/{object} bucket.storage.googleapis.com/{object}
     * 
     */
    @Import(name="tempStoragePrefix")
      private final @Nullable Output<String> tempStoragePrefix;

    public Output<String> getTempStoragePrefix() {
        return this.tempStoragePrefix == null ? Codegen.empty() : this.tempStoragePrefix;
    }

    /**
     * The ID string of the VM.
     * 
     */
    @Import(name="vmId")
      private final @Nullable Output<String> vmId;

    public Output<String> getVmId() {
        return this.vmId == null ? Codegen.empty() : this.vmId;
    }

    /**
     * The file to store the workflow in.
     * 
     */
    @Import(name="workflowFileName")
      private final @Nullable Output<String> workflowFileName;

    public Output<String> getWorkflowFileName() {
        return this.workflowFileName == null ? Codegen.empty() : this.workflowFileName;
    }

    public TaskRunnerSettingsArgs(
        @Nullable Output<Boolean> alsologtostderr,
        @Nullable Output<String> baseTaskDir,
        @Nullable Output<String> baseUrl,
        @Nullable Output<String> commandlinesFileName,
        @Nullable Output<Boolean> continueOnException,
        @Nullable Output<String> dataflowApiVersion,
        @Nullable Output<String> harnessCommand,
        @Nullable Output<String> languageHint,
        @Nullable Output<String> logDir,
        @Nullable Output<Boolean> logToSerialconsole,
        @Nullable Output<String> logUploadLocation,
        @Nullable Output<List<String>> oauthScopes,
        @Nullable Output<WorkerSettingsArgs> parallelWorkerSettings,
        @Nullable Output<String> streamingWorkerMainClass,
        @Nullable Output<String> taskGroup,
        @Nullable Output<String> taskUser,
        @Nullable Output<String> tempStoragePrefix,
        @Nullable Output<String> vmId,
        @Nullable Output<String> workflowFileName) {
        this.alsologtostderr = alsologtostderr;
        this.baseTaskDir = baseTaskDir;
        this.baseUrl = baseUrl;
        this.commandlinesFileName = commandlinesFileName;
        this.continueOnException = continueOnException;
        this.dataflowApiVersion = dataflowApiVersion;
        this.harnessCommand = harnessCommand;
        this.languageHint = languageHint;
        this.logDir = logDir;
        this.logToSerialconsole = logToSerialconsole;
        this.logUploadLocation = logUploadLocation;
        this.oauthScopes = oauthScopes;
        this.parallelWorkerSettings = parallelWorkerSettings;
        this.streamingWorkerMainClass = streamingWorkerMainClass;
        this.taskGroup = taskGroup;
        this.taskUser = taskUser;
        this.tempStoragePrefix = tempStoragePrefix;
        this.vmId = vmId;
        this.workflowFileName = workflowFileName;
    }

    private TaskRunnerSettingsArgs() {
        this.alsologtostderr = Codegen.empty();
        this.baseTaskDir = Codegen.empty();
        this.baseUrl = Codegen.empty();
        this.commandlinesFileName = Codegen.empty();
        this.continueOnException = Codegen.empty();
        this.dataflowApiVersion = Codegen.empty();
        this.harnessCommand = Codegen.empty();
        this.languageHint = Codegen.empty();
        this.logDir = Codegen.empty();
        this.logToSerialconsole = Codegen.empty();
        this.logUploadLocation = Codegen.empty();
        this.oauthScopes = Codegen.empty();
        this.parallelWorkerSettings = Codegen.empty();
        this.streamingWorkerMainClass = Codegen.empty();
        this.taskGroup = Codegen.empty();
        this.taskUser = Codegen.empty();
        this.tempStoragePrefix = Codegen.empty();
        this.vmId = Codegen.empty();
        this.workflowFileName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskRunnerSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> alsologtostderr;
        private @Nullable Output<String> baseTaskDir;
        private @Nullable Output<String> baseUrl;
        private @Nullable Output<String> commandlinesFileName;
        private @Nullable Output<Boolean> continueOnException;
        private @Nullable Output<String> dataflowApiVersion;
        private @Nullable Output<String> harnessCommand;
        private @Nullable Output<String> languageHint;
        private @Nullable Output<String> logDir;
        private @Nullable Output<Boolean> logToSerialconsole;
        private @Nullable Output<String> logUploadLocation;
        private @Nullable Output<List<String>> oauthScopes;
        private @Nullable Output<WorkerSettingsArgs> parallelWorkerSettings;
        private @Nullable Output<String> streamingWorkerMainClass;
        private @Nullable Output<String> taskGroup;
        private @Nullable Output<String> taskUser;
        private @Nullable Output<String> tempStoragePrefix;
        private @Nullable Output<String> vmId;
        private @Nullable Output<String> workflowFileName;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskRunnerSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alsologtostderr = defaults.alsologtostderr;
    	      this.baseTaskDir = defaults.baseTaskDir;
    	      this.baseUrl = defaults.baseUrl;
    	      this.commandlinesFileName = defaults.commandlinesFileName;
    	      this.continueOnException = defaults.continueOnException;
    	      this.dataflowApiVersion = defaults.dataflowApiVersion;
    	      this.harnessCommand = defaults.harnessCommand;
    	      this.languageHint = defaults.languageHint;
    	      this.logDir = defaults.logDir;
    	      this.logToSerialconsole = defaults.logToSerialconsole;
    	      this.logUploadLocation = defaults.logUploadLocation;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.parallelWorkerSettings = defaults.parallelWorkerSettings;
    	      this.streamingWorkerMainClass = defaults.streamingWorkerMainClass;
    	      this.taskGroup = defaults.taskGroup;
    	      this.taskUser = defaults.taskUser;
    	      this.tempStoragePrefix = defaults.tempStoragePrefix;
    	      this.vmId = defaults.vmId;
    	      this.workflowFileName = defaults.workflowFileName;
        }

        public Builder alsologtostderr(@Nullable Output<Boolean> alsologtostderr) {
            this.alsologtostderr = alsologtostderr;
            return this;
        }
        public Builder alsologtostderr(@Nullable Boolean alsologtostderr) {
            this.alsologtostderr = Codegen.ofNullable(alsologtostderr);
            return this;
        }
        public Builder baseTaskDir(@Nullable Output<String> baseTaskDir) {
            this.baseTaskDir = baseTaskDir;
            return this;
        }
        public Builder baseTaskDir(@Nullable String baseTaskDir) {
            this.baseTaskDir = Codegen.ofNullable(baseTaskDir);
            return this;
        }
        public Builder baseUrl(@Nullable Output<String> baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
        public Builder baseUrl(@Nullable String baseUrl) {
            this.baseUrl = Codegen.ofNullable(baseUrl);
            return this;
        }
        public Builder commandlinesFileName(@Nullable Output<String> commandlinesFileName) {
            this.commandlinesFileName = commandlinesFileName;
            return this;
        }
        public Builder commandlinesFileName(@Nullable String commandlinesFileName) {
            this.commandlinesFileName = Codegen.ofNullable(commandlinesFileName);
            return this;
        }
        public Builder continueOnException(@Nullable Output<Boolean> continueOnException) {
            this.continueOnException = continueOnException;
            return this;
        }
        public Builder continueOnException(@Nullable Boolean continueOnException) {
            this.continueOnException = Codegen.ofNullable(continueOnException);
            return this;
        }
        public Builder dataflowApiVersion(@Nullable Output<String> dataflowApiVersion) {
            this.dataflowApiVersion = dataflowApiVersion;
            return this;
        }
        public Builder dataflowApiVersion(@Nullable String dataflowApiVersion) {
            this.dataflowApiVersion = Codegen.ofNullable(dataflowApiVersion);
            return this;
        }
        public Builder harnessCommand(@Nullable Output<String> harnessCommand) {
            this.harnessCommand = harnessCommand;
            return this;
        }
        public Builder harnessCommand(@Nullable String harnessCommand) {
            this.harnessCommand = Codegen.ofNullable(harnessCommand);
            return this;
        }
        public Builder languageHint(@Nullable Output<String> languageHint) {
            this.languageHint = languageHint;
            return this;
        }
        public Builder languageHint(@Nullable String languageHint) {
            this.languageHint = Codegen.ofNullable(languageHint);
            return this;
        }
        public Builder logDir(@Nullable Output<String> logDir) {
            this.logDir = logDir;
            return this;
        }
        public Builder logDir(@Nullable String logDir) {
            this.logDir = Codegen.ofNullable(logDir);
            return this;
        }
        public Builder logToSerialconsole(@Nullable Output<Boolean> logToSerialconsole) {
            this.logToSerialconsole = logToSerialconsole;
            return this;
        }
        public Builder logToSerialconsole(@Nullable Boolean logToSerialconsole) {
            this.logToSerialconsole = Codegen.ofNullable(logToSerialconsole);
            return this;
        }
        public Builder logUploadLocation(@Nullable Output<String> logUploadLocation) {
            this.logUploadLocation = logUploadLocation;
            return this;
        }
        public Builder logUploadLocation(@Nullable String logUploadLocation) {
            this.logUploadLocation = Codegen.ofNullable(logUploadLocation);
            return this;
        }
        public Builder oauthScopes(@Nullable Output<List<String>> oauthScopes) {
            this.oauthScopes = oauthScopes;
            return this;
        }
        public Builder oauthScopes(@Nullable List<String> oauthScopes) {
            this.oauthScopes = Codegen.ofNullable(oauthScopes);
            return this;
        }
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }
        public Builder parallelWorkerSettings(@Nullable Output<WorkerSettingsArgs> parallelWorkerSettings) {
            this.parallelWorkerSettings = parallelWorkerSettings;
            return this;
        }
        public Builder parallelWorkerSettings(@Nullable WorkerSettingsArgs parallelWorkerSettings) {
            this.parallelWorkerSettings = Codegen.ofNullable(parallelWorkerSettings);
            return this;
        }
        public Builder streamingWorkerMainClass(@Nullable Output<String> streamingWorkerMainClass) {
            this.streamingWorkerMainClass = streamingWorkerMainClass;
            return this;
        }
        public Builder streamingWorkerMainClass(@Nullable String streamingWorkerMainClass) {
            this.streamingWorkerMainClass = Codegen.ofNullable(streamingWorkerMainClass);
            return this;
        }
        public Builder taskGroup(@Nullable Output<String> taskGroup) {
            this.taskGroup = taskGroup;
            return this;
        }
        public Builder taskGroup(@Nullable String taskGroup) {
            this.taskGroup = Codegen.ofNullable(taskGroup);
            return this;
        }
        public Builder taskUser(@Nullable Output<String> taskUser) {
            this.taskUser = taskUser;
            return this;
        }
        public Builder taskUser(@Nullable String taskUser) {
            this.taskUser = Codegen.ofNullable(taskUser);
            return this;
        }
        public Builder tempStoragePrefix(@Nullable Output<String> tempStoragePrefix) {
            this.tempStoragePrefix = tempStoragePrefix;
            return this;
        }
        public Builder tempStoragePrefix(@Nullable String tempStoragePrefix) {
            this.tempStoragePrefix = Codegen.ofNullable(tempStoragePrefix);
            return this;
        }
        public Builder vmId(@Nullable Output<String> vmId) {
            this.vmId = vmId;
            return this;
        }
        public Builder vmId(@Nullable String vmId) {
            this.vmId = Codegen.ofNullable(vmId);
            return this;
        }
        public Builder workflowFileName(@Nullable Output<String> workflowFileName) {
            this.workflowFileName = workflowFileName;
            return this;
        }
        public Builder workflowFileName(@Nullable String workflowFileName) {
            this.workflowFileName = Codegen.ofNullable(workflowFileName);
            return this;
        }        public TaskRunnerSettingsArgs build() {
            return new TaskRunnerSettingsArgs(alsologtostderr, baseTaskDir, baseUrl, commandlinesFileName, continueOnException, dataflowApiVersion, harnessCommand, languageHint, logDir, logToSerialconsole, logUploadLocation, oauthScopes, parallelWorkerSettings, streamingWorkerMainClass, taskGroup, taskUser, tempStoragePrefix, vmId, workflowFileName);
        }
    }
}
