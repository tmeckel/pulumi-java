// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Google Cloud Endpoints (https://cloud.google.com/appengine/docs/python/endpoints/) configuration for API handlers.
 * 
 */
public final class ApiConfigHandlerResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApiConfigHandlerResponse Empty = new ApiConfigHandlerResponse();

    /**
     * Action to take when users access resources that require authentication. Defaults to redirect.
     * 
     */
    @InputImport(name="authFailAction", required=true)
    private final String authFailAction;

    public String getAuthFailAction() {
        return this.authFailAction;
    }

    /**
     * Level of login required to access this resource. Defaults to optional.
     * 
     */
    @InputImport(name="login", required=true)
    private final String login;

    public String getLogin() {
        return this.login;
    }

    /**
     * Path to the script from the application root directory.
     * 
     */
    @InputImport(name="script", required=true)
    private final String script;

    public String getScript() {
        return this.script;
    }

    /**
     * Security (HTTPS) enforcement for this URL.
     * 
     */
    @InputImport(name="securityLevel", required=true)
    private final String securityLevel;

    public String getSecurityLevel() {
        return this.securityLevel;
    }

    /**
     * URL to serve the endpoint at.
     * 
     */
    @InputImport(name="url", required=true)
    private final String url;

    public String getUrl() {
        return this.url;
    }

    public ApiConfigHandlerResponse(
        String authFailAction,
        String login,
        String script,
        String securityLevel,
        String url) {
        this.authFailAction = Objects.requireNonNull(authFailAction, "expected parameter 'authFailAction' to be non-null");
        this.login = Objects.requireNonNull(login, "expected parameter 'login' to be non-null");
        this.script = Objects.requireNonNull(script, "expected parameter 'script' to be non-null");
        this.securityLevel = Objects.requireNonNull(securityLevel, "expected parameter 'securityLevel' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private ApiConfigHandlerResponse() {
        this.authFailAction = null;
        this.login = null;
        this.script = null;
        this.securityLevel = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConfigHandlerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authFailAction;
        private String login;
        private String script;
        private String securityLevel;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiConfigHandlerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authFailAction = defaults.authFailAction;
    	      this.login = defaults.login;
    	      this.script = defaults.script;
    	      this.securityLevel = defaults.securityLevel;
    	      this.url = defaults.url;
        }

        public Builder setAuthFailAction(String authFailAction) {
            this.authFailAction = Objects.requireNonNull(authFailAction);
            return this;
        }

        public Builder setLogin(String login) {
            this.login = Objects.requireNonNull(login);
            return this;
        }

        public Builder setScript(String script) {
            this.script = Objects.requireNonNull(script);
            return this;
        }

        public Builder setSecurityLevel(String securityLevel) {
            this.securityLevel = Objects.requireNonNull(securityLevel);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public ApiConfigHandlerResponse build() {
            return new ApiConfigHandlerResponse(authFailAction, login, script, securityLevel, url);
        }
    }
}
