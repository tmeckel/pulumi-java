// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apikeys_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class V2ApiTargetResponse {
    /**
     * Optional. List of one or more methods that can be called. If empty, all methods for the service are allowed. A wildcard (*) can be used as the last symbol. Valid examples: `google.cloud.translate.v2.TranslateService.GetSupportedLanguage` `TranslateText` `Get*` `translate.googleapis.com.Get*`
     * 
     */
    private final List<String> methods;
    /**
     * The service for this restriction. It should be the canonical service name, for example: `translate.googleapis.com`. You can use [`gcloud services list`](/sdk/gcloud/reference/services/list) to get a list of services that are enabled in the project.
     * 
     */
    private final String service;

    @OutputCustomType.Constructor({"methods","service"})
    private V2ApiTargetResponse(
        List<String> methods,
        String service) {
        this.methods = Objects.requireNonNull(methods);
        this.service = Objects.requireNonNull(service);
    }

    /**
     * Optional. List of one or more methods that can be called. If empty, all methods for the service are allowed. A wildcard (*) can be used as the last symbol. Valid examples: `google.cloud.translate.v2.TranslateService.GetSupportedLanguage` `TranslateText` `Get*` `translate.googleapis.com.Get*`
     * 
     */
    public List<String> getMethods() {
        return this.methods;
    }
    /**
     * The service for this restriction. It should be the canonical service name, for example: `translate.googleapis.com`. You can use [`gcloud services list`](/sdk/gcloud/reference/services/list) to get a list of services that are enabled in the project.
     * 
     */
    public String getService() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2ApiTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> methods;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(V2ApiTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.methods = defaults.methods;
    	      this.service = defaults.service;
        }

        public Builder setMethods(List<String> methods) {
            this.methods = Objects.requireNonNull(methods);
            return this;
        }

        public Builder setService(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public V2ApiTargetResponse build() {
            return new V2ApiTargetResponse(methods, service);
        }
    }
}
