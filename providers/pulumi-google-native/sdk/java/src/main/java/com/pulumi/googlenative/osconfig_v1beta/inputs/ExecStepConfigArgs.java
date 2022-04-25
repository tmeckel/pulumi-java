// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig_v1beta.enums.ExecStepConfigInterpreter;
import com.pulumi.googlenative.osconfig_v1beta.inputs.GcsObjectArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Common configurations for an ExecStep.
 * 
 */
public final class ExecStepConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExecStepConfigArgs Empty = new ExecStepConfigArgs();

    /**
     * Defaults to [0]. A list of possible return values that the execution can return to indicate a success.
     * 
     */
    @Import(name="allowedSuccessCodes")
    private @Nullable Output<List<Integer>> allowedSuccessCodes;

    /**
     * @return Defaults to [0]. A list of possible return values that the execution can return to indicate a success.
     * 
     */
    public Optional<Output<List<Integer>>> allowedSuccessCodes() {
        return Optional.ofNullable(this.allowedSuccessCodes);
    }

    /**
     * A Google Cloud Storage object containing the executable.
     * 
     */
    @Import(name="gcsObject")
    private @Nullable Output<GcsObjectArgs> gcsObject;

    /**
     * @return A Google Cloud Storage object containing the executable.
     * 
     */
    public Optional<Output<GcsObjectArgs>> gcsObject() {
        return Optional.ofNullable(this.gcsObject);
    }

    /**
     * The script interpreter to use to run the script. If no interpreter is specified the script will be executed directly, which will likely only succeed for scripts with [shebang lines] (https://en.wikipedia.org/wiki/Shebang_\(Unix\)).
     * 
     */
    @Import(name="interpreter")
    private @Nullable Output<ExecStepConfigInterpreter> interpreter;

    /**
     * @return The script interpreter to use to run the script. If no interpreter is specified the script will be executed directly, which will likely only succeed for scripts with [shebang lines] (https://en.wikipedia.org/wiki/Shebang_\(Unix\)).
     * 
     */
    public Optional<Output<ExecStepConfigInterpreter>> interpreter() {
        return Optional.ofNullable(this.interpreter);
    }

    /**
     * An absolute path to the executable on the VM.
     * 
     */
    @Import(name="localPath")
    private @Nullable Output<String> localPath;

    /**
     * @return An absolute path to the executable on the VM.
     * 
     */
    public Optional<Output<String>> localPath() {
        return Optional.ofNullable(this.localPath);
    }

    private ExecStepConfigArgs() {}

    private ExecStepConfigArgs(ExecStepConfigArgs $) {
        this.allowedSuccessCodes = $.allowedSuccessCodes;
        this.gcsObject = $.gcsObject;
        this.interpreter = $.interpreter;
        this.localPath = $.localPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExecStepConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExecStepConfigArgs $;

        public Builder() {
            $ = new ExecStepConfigArgs();
        }

        public Builder(ExecStepConfigArgs defaults) {
            $ = new ExecStepConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedSuccessCodes Defaults to [0]. A list of possible return values that the execution can return to indicate a success.
         * 
         * @return builder
         * 
         */
        public Builder allowedSuccessCodes(@Nullable Output<List<Integer>> allowedSuccessCodes) {
            $.allowedSuccessCodes = allowedSuccessCodes;
            return this;
        }

        /**
         * @param allowedSuccessCodes Defaults to [0]. A list of possible return values that the execution can return to indicate a success.
         * 
         * @return builder
         * 
         */
        public Builder allowedSuccessCodes(List<Integer> allowedSuccessCodes) {
            return allowedSuccessCodes(Output.of(allowedSuccessCodes));
        }

        /**
         * @param allowedSuccessCodes Defaults to [0]. A list of possible return values that the execution can return to indicate a success.
         * 
         * @return builder
         * 
         */
        public Builder allowedSuccessCodes(Integer... allowedSuccessCodes) {
            return allowedSuccessCodes(List.of(allowedSuccessCodes));
        }

        /**
         * @param gcsObject A Google Cloud Storage object containing the executable.
         * 
         * @return builder
         * 
         */
        public Builder gcsObject(@Nullable Output<GcsObjectArgs> gcsObject) {
            $.gcsObject = gcsObject;
            return this;
        }

        /**
         * @param gcsObject A Google Cloud Storage object containing the executable.
         * 
         * @return builder
         * 
         */
        public Builder gcsObject(GcsObjectArgs gcsObject) {
            return gcsObject(Output.of(gcsObject));
        }

        /**
         * @param interpreter The script interpreter to use to run the script. If no interpreter is specified the script will be executed directly, which will likely only succeed for scripts with [shebang lines] (https://en.wikipedia.org/wiki/Shebang_\(Unix\)).
         * 
         * @return builder
         * 
         */
        public Builder interpreter(@Nullable Output<ExecStepConfigInterpreter> interpreter) {
            $.interpreter = interpreter;
            return this;
        }

        /**
         * @param interpreter The script interpreter to use to run the script. If no interpreter is specified the script will be executed directly, which will likely only succeed for scripts with [shebang lines] (https://en.wikipedia.org/wiki/Shebang_\(Unix\)).
         * 
         * @return builder
         * 
         */
        public Builder interpreter(ExecStepConfigInterpreter interpreter) {
            return interpreter(Output.of(interpreter));
        }

        /**
         * @param localPath An absolute path to the executable on the VM.
         * 
         * @return builder
         * 
         */
        public Builder localPath(@Nullable Output<String> localPath) {
            $.localPath = localPath;
            return this;
        }

        /**
         * @param localPath An absolute path to the executable on the VM.
         * 
         * @return builder
         * 
         */
        public Builder localPath(String localPath) {
            return localPath(Output.of(localPath));
        }

        public ExecStepConfigArgs build() {
            return $;
        }
    }

}
