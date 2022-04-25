// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourceExecResourceExecResponse;
import java.util.Objects;


/**
 * A resource that allows executing scripts on the VM. The `ExecResource` has 2 stages: `validate` and `enforce` and both stages accept a script as an argument to execute. When the `ExecResource` is applied by the agent, it first executes the script in the `validate` stage. The `validate` stage can signal that the `ExecResource` is already in the desired state by returning an exit code of `100`. If the `ExecResource` is not in the desired state, it should return an exit code of `101`. Any other exit code returned by this stage is considered an error. If the `ExecResource` is not in the desired state based on the exit code from the `validate` stage, the agent proceeds to execute the script from the `enforce` stage. If the `ExecResource` is already in the desired state, the `enforce` stage will not be run. Similar to `validate` stage, the `enforce` stage should return an exit code of `100` to indicate that the resource in now in its desired state. Any other exit code is considered an error. NOTE: An exit code of `100` was chosen over `0` (and `101` vs `1`) to have an explicit indicator of `in desired state`, `not in desired state` and errors. Because, for example, Powershell will always return an exit code of `0` unless an `exit` statement is provided in the script. So, for reasons of consistency and being explicit, exit codes `100` and `101` were chosen.
 * 
 */
public final class OSPolicyResourceExecResourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourceExecResourceResponse Empty = new OSPolicyResourceExecResourceResponse();

    /**
     * What to run to bring this resource into the desired state. An exit code of 100 indicates &#34;success&#34;, any other exit code indicates a failure running enforce.
     * 
     */
    @Import(name="enforce", required=true)
    private OSPolicyResourceExecResourceExecResponse enforce;

    /**
     * @return What to run to bring this resource into the desired state. An exit code of 100 indicates &#34;success&#34;, any other exit code indicates a failure running enforce.
     * 
     */
    public OSPolicyResourceExecResourceExecResponse enforce() {
        return this.enforce;
    }

    /**
     * What to run to validate this resource is in the desired state. An exit code of 100 indicates &#34;in desired state&#34;, and exit code of 101 indicates &#34;not in desired state&#34;. Any other exit code indicates a failure running validate.
     * 
     */
    @Import(name="validate", required=true)
    private OSPolicyResourceExecResourceExecResponse validate;

    /**
     * @return What to run to validate this resource is in the desired state. An exit code of 100 indicates &#34;in desired state&#34;, and exit code of 101 indicates &#34;not in desired state&#34;. Any other exit code indicates a failure running validate.
     * 
     */
    public OSPolicyResourceExecResourceExecResponse validate() {
        return this.validate;
    }

    private OSPolicyResourceExecResourceResponse() {}

    private OSPolicyResourceExecResourceResponse(OSPolicyResourceExecResourceResponse $) {
        this.enforce = $.enforce;
        this.validate = $.validate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSPolicyResourceExecResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourceExecResourceResponse $;

        public Builder() {
            $ = new OSPolicyResourceExecResourceResponse();
        }

        public Builder(OSPolicyResourceExecResourceResponse defaults) {
            $ = new OSPolicyResourceExecResourceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param enforce What to run to bring this resource into the desired state. An exit code of 100 indicates &#34;success&#34;, any other exit code indicates a failure running enforce.
         * 
         * @return builder
         * 
         */
        public Builder enforce(OSPolicyResourceExecResourceExecResponse enforce) {
            $.enforce = enforce;
            return this;
        }

        /**
         * @param validate What to run to validate this resource is in the desired state. An exit code of 100 indicates &#34;in desired state&#34;, and exit code of 101 indicates &#34;not in desired state&#34;. Any other exit code indicates a failure running validate.
         * 
         * @return builder
         * 
         */
        public Builder validate(OSPolicyResourceExecResourceExecResponse validate) {
            $.validate = validate;
            return this;
        }

        public OSPolicyResourceExecResourceResponse build() {
            $.enforce = Objects.requireNonNull($.enforce, "expected parameter 'enforce' to be non-null");
            $.validate = Objects.requireNonNull($.validate, "expected parameter 'validate' to be non-null");
            return $;
        }
    }

}
