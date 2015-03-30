package com.mygdx.sumogame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.mygdx.gamescreens.GameScreen;
import com.mygdx.helpers.ActionResolver;
import com.mygdx.helpers.AssetLoader;

// This is where the Game is Launched. 
// Extends from GameClass which provides the setScreen method to move to a next Screen.
public class SPGame extends Game {
    private ActionResolver actionResolver;
    public SPGame(ActionResolver actionResolver) {
        this.actionResolver = actionResolver;
    }
	@Override
	// default method called by the framework to start the game.
	public void create () {
		Gdx.app.log("SPGame", "created");
		// Loads all the texture files. 
		AssetLoader.load();
		// changes the screen to the gameplay screen.
		setScreen(new GameScreen(actionResolver));
	}

	@Override
	// method called to dispose of the screen
	// also disposes the created texture.  
    public void dispose() {
        super.dispose();
        AssetLoader.dispose();
    }
}