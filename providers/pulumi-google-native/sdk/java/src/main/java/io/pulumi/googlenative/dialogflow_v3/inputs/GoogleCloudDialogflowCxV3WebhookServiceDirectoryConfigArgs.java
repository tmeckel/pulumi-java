// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents configuration for a [Service Directory](https://cloud.google.com/service-directory) service.
 * 
 */
public final class GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs Empty = new GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs();

    /**
     * Generic Service configuration of this webhook.
     * 
     */
    @InputImport(name="genericWebService")
      private final @Nullable Input<GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs> genericWebService;

    public Input<GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs> getGenericWebService() {
        return this.genericWebService == null ? Input.empty() : this.genericWebService;
    }

    /**
     * The name of [Service Directory](https://cloud.google.com/service-directory) service. Format: `projects//locations//namespaces//services/`. `Location ID` of the service directory must be the same as the location of the agent.
     * 
     */
    @InputImport(name="service", required=true)
      private final Input<String> service;

    public Input<String> getService() {
        return this.service;
    }

    public GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs(
        @Nullable Input<GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs> genericWebService,
        Input<String> service) {
        this.genericWebService = genericWebService;
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
    }

    private GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs() {
        this.genericWebService = Input.empty();
        this.service = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs> genericWebService;
        private Input<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.genericWebService = defaults.genericWebService;
    	      this.service = defaults.service;
        }

        public Builder genericWebService(@Nullable Input<GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs> genericWebService) {
            this.genericWebService = genericWebService;
            return this;
        }

        public Builder genericWebService(@Nullable GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs genericWebService) {
            this.genericWebService = Input.ofNullable(genericWebService);
            return this;
        }

        public Builder service(Input<String> service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public Builder service(String service) {
            this.service = Input.of(Objects.requireNonNull(service));
            return this;
        }
        public GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs build() {
            return new GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs(genericWebService, service);
        }
    }
}
