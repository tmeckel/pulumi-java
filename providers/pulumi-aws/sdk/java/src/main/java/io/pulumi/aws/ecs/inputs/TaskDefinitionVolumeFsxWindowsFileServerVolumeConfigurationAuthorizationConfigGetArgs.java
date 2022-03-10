// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigGetArgs Empty = new TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigGetArgs();

    /**
     * The authorization credential option to use. The authorization credential options can be provided using either the Amazon Resource Name (ARN) of an AWS Secrets Manager secret or AWS Systems Manager Parameter Store parameter. The ARNs refer to the stored credentials.
     * 
     */
    @InputImport(name="credentialsParameter", required=true)
      private final Input<String> credentialsParameter;

    public Input<String> getCredentialsParameter() {
        return this.credentialsParameter;
    }

    /**
     * A fully qualified domain name hosted by an AWS Directory Service Managed Microsoft AD (Active Directory) or self-hosted AD on Amazon EC2.
     * 
     */
    @InputImport(name="domain", required=true)
      private final Input<String> domain;

    public Input<String> getDomain() {
        return this.domain;
    }

    public TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigGetArgs(
        Input<String> credentialsParameter,
        Input<String> domain) {
        this.credentialsParameter = Objects.requireNonNull(credentialsParameter, "expected parameter 'credentialsParameter' to be non-null");
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
    }

    private TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigGetArgs() {
        this.credentialsParameter = Input.empty();
        this.domain = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> credentialsParameter;
        private Input<String> domain;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentialsParameter = defaults.credentialsParameter;
    	      this.domain = defaults.domain;
        }

        public Builder credentialsParameter(Input<String> credentialsParameter) {
            this.credentialsParameter = Objects.requireNonNull(credentialsParameter);
            return this;
        }

        public Builder credentialsParameter(String credentialsParameter) {
            this.credentialsParameter = Input.of(Objects.requireNonNull(credentialsParameter));
            return this;
        }

        public Builder domain(Input<String> domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }

        public Builder domain(String domain) {
            this.domain = Input.of(Objects.requireNonNull(domain));
            return this;
        }
        public TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigGetArgs build() {
            return new TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigGetArgs(credentialsParameter, domain);
        }
    }
}
